package BehavioralDesignPatterns.Responsibilities;

public class Director extends Handler{

    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType() == RequestType.GOOD_REVIEW) {
            System.out.println("The director received your good review. Thank you!");
        }
        else {
            successor.handleRequest(request);
        }
    }
}