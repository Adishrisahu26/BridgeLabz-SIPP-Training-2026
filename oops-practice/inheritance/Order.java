class Order{

    int orderId;
    String orderDate;

    Order(int orderId,String orderDate){
        this.orderId=orderId;
        this.orderDate=orderDate;
    }

    String getOrderStatus(){
        return "Order Placed";
    }
}

class ShippedOrder extends Order{

    String trackingNumber;

    ShippedOrder(int id,String date,String trackingNumber){
        super(id,date);
        this.trackingNumber=trackingNumber;
    }

    String getOrderStatus(){
        return "Order Shipped";
    }
}

class DeliveredOrder extends ShippedOrder{

    String deliveryDate;

    DeliveredOrder(int id,String date,String tracking,String deliveryDate){
        super(id,date,tracking);
        this.deliveryDate=deliveryDate;
    }

    String getOrderStatus(){
        return "Order Delivered";
    }

    public static void main(String args[]){

        DeliveredOrder d=new DeliveredOrder(1,"10 June","TR123","15 June");

        System.out.println(d.getOrderStatus());
    }
}