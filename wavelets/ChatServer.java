import java.io.IOException;
import java.net.URI;

class Handler implements URLHandler {
    // The one bit of state on the server: a number that will be manipulated by
    // various requests.

    String homeString = "Home:\n";
    String addToChat = "\tAdd to chat: '/add-message?s=<string>&user=<string>'\n";

    String chat = "";

    public String handleRequest(URI url) 
    {
        String urlPath = url.getPath();
        
        if (urlPath.equals("/")) {
            return homeString + addToChat;
        } else if (urlPath.startsWith("/add-message")) {
            String[] query = url.getQuery().split("&");

            if (query[0] != null && query[0].startsWith("s=")) {
                if (query[1] != null && query[1].startsWith("user=")) {
                    String message = (query[0].split("="))[1];
                    String user = query[1].split("=")[1];
    
                    chat += String.format("%s: %s\n", user, message);
    
                    return chat;
                }
            }
        }
        return "404 Not Found!";
    }
}

class ChatServer {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}