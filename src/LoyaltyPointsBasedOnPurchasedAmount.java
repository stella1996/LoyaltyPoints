import java.util.HashMap;

public class LoyaltyPointsBasedOnPurchasedAmount {


    public static void main(String[] args) {


        HashMap<String, String> loyaltyPoints = new HashMap<String, String>();
        loyaltyPoints.put("1000 Rupees", "100 Points");
        loyaltyPoints.put("5000 Rupees", "750 Points");
        loyaltyPoints.put("10000 Rupees", "2000 Points");

        System.out.println("Loyalty Points Based On Purchased Amount" + loyaltyPoints);

    }
}