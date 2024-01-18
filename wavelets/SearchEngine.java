import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Handler implements URLHandler {
    // The one bit of state on the server: a number that will be manipulated by
    // various requests.
    List<String> strList = new ArrayList<>();

    String homeString = "Home:\n";
    String add = "\tAdd url path: '/add?s=<string>' to add to SearchEngine.\n";
    String search = "\tAdd url path: '/search?s=<string>' to search for strings containing <string>.\n";
    String multipleAddOrSearch = "\tUse \"\" to search multiple items when separated by commas. Strings without \"\" are considered single items.\n";
    String multipleAddOrSearchExample = "\tEx: \"<string1>, <string2>\" takes BOTH '<string1>' and '<string2>'.\n \tEx 2: <string>, <string2> takes ONLY '<string>, <string2>.'";

    public boolean checkQuotes(String fieldValue) {
        return fieldValue.startsWith("\"") && fieldValue.endsWith("\"");
    }

    private void addToList(String fieldValue, boolean hasQuotes) {
        if (hasQuotes) {
            for (String s : fieldValue.substring(1, fieldValue.length() - 1).split(",")) {
                strList.add(s.strip());
            }
        } else strList.add(fieldValue);
    }

    public String handleRequest(URI url) 
    {
        String urlPath = url.getPath();
        
        if (urlPath.equals("/")) {
            return homeString + add + search + multipleAddOrSearch + multipleAddOrSearchExample;
        } else if (urlPath.startsWith("/add")) {
            String[] parameters = url.getQuery().split("=");

            if (parameters[0] != null && parameters[0].equals("s")) {
                boolean hasQuotes = checkQuotes(parameters[1]);
                this.addToList(parameters[1], hasQuotes);

                String addedString = "";
                if (hasQuotes) {
                    for (String s : parameters[1].substring(1, parameters[1].length() - 1).split(",")) {
                        addedString += "'" + s.strip() + "', "; 
                    }
                    addedString = addedString.substring(0, addedString.length() - 2);
                } else {
                    addedString = "'" + parameters[1] + "'";
                }

                return String.format("Successfully added %s to the SearchEngine", addedString);
            }
        } else if (urlPath.startsWith("/search")) { // TODO: Implement double word search
            String[] parameters = url.getQuery().split("=");
            ArrayList<String> results = new ArrayList<>();
            if (parameters[0] != null && parameters[0].equals("s")) {
                for (String s : this.strList) {
                    if (s != null && s.contains(parameters[1])) {
                        results.add(s);
                    } 
                }
                return "Results: " + results.toString();
            }
        } else if (urlPath.startsWith("/all")) {
            return String.format("Entire search engine: %s", 
                                String.join(", ", strList
                                .stream()
                                .map(str -> ("'" + str + "'"))
                                .collect(Collectors.toList())
                                ));
        }
        return "404 Not Found!";
    }
}

class SearchEngine {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}
