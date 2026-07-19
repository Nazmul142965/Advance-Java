public class Payment {

    public void pay(String type){
        if(type.equals("cash")){
            IO.println("Cash Payment");
        }else if(type.equals("card")){
            IO.println("Card Payment");
        }
        //wrong approach
        else if(type.equals("Bkash")){
            IO.println("Bkash Payment");
        }
    }
}

//open close principle, open to extend close to modify