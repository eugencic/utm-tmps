package BehavioralDesignPatterns.Responsibilities;

public class VP extends Handler {

    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType() == RequestType.BAD_REVIEW) {
            if(request.getAmount() < 3) {
                System.out.println("VP received your bad review. We are very sorry to hear about your bad experience. Thank you!");
            }
        }
    }
}