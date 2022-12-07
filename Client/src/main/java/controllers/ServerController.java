import spiffyUrlManipulator




//handles request flow and talks directly to client
//communicates to the view and the model
//asks models to get data
//the controller never handles the data directly but just uses the model to perform tasks
//controller receives the response from the model,
//the controller then has to intereact with the view to show to the user
//the view handles the presentation and the controller shares it back with the client



//this specific controller communicates to the server and to You are ell
//I assume it is taking stuff from the transaction controller
public class ServerController() {
    private String rootURL = "http://zipcode.rocks:8085";

    private ServerController svr = new ServerController();

    private ServerController() {}

    public static shared() {
        return svr;
    }
//where http calls are happening
    public JsonString idGet() {
        // url -> /ids/
        // send the server a get with url
        // return json from server
    }
    public JsonString idPost(Id) {
        // url -> /ids/
        // create json from Id
        // request
        // reply
        // return json
    }
    public JsonString idPut(Id) {
        // url -> /ids/
    }


}

// ServerController.shared.doGet()