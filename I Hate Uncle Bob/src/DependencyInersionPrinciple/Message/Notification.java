package DependencyInersionPrinciple.Message;

public class Notification {
    private MessageSender sender;


    //dip
    public Notification(MessageSender sender){
        this.sender = sender;
    }

    public void notifyUser(String msg){
        sender.send(msg);
    }
}
