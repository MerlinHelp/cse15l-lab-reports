import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;

class Handler implements URLHandler {
    // The one bit of state on the server: a number that will be manipulated by
    // various requests.
    ArrayList<String> strList = new ArrayList<>();

    public String handleRequest(URI url) {
        if (url.getPath().equals("/")) {
            return String.format("Home:\nAdd url path: '/add?s=<string>' to add to SearchEngine\nAdd url path: '/search?s=<string>' to search for strings containing <string>.");
        } else if (url.getPath().contains("/add")) {
            String[] parameters = url.getQuery().split("=");
            if (parameters[0].equals("s")) {
                strList.add(parameters[1]);
                return String.format("Successfully added '%s' to the SearchEngine!", parameters[1]);
            }
        } else if (url.getPath().contains("/search")) {
            String[] parameters = url.getQuery().split("=");
            ArrayList<String> results = new ArrayList<>();
            if (parameters[0].equals("s")) {
                for (String s : strList) {
                    if (s != null && s.contains(parameters[1])) {
                        results.add(s);
                    } 
                }
                return "Results: " + results.toString();
            }
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
