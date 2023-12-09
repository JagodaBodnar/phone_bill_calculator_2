import java.util.Random;

public class PhoneBill {
    private int id;
    private double baseCost;
    private double allottedMinutes;
    private double minutesUsed;

    Random rand = new Random();

    public PhoneBill() {
        id = rand.nextInt(100);
        baseCost = 89.99;
        allottedMinutes = 100;
        minutesUsed = 100;
    }

    public PhoneBill(int id) {
        setId(id);
        setAllFields(this.id, 89.99, 100, 100);
    }

    public PhoneBill(int id, double baseCost, double allottedMinutes, double minutesUsed) {
        setAllFields(id, baseCost, allottedMinutes, minutesUsed);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void  setMinutesUsed(double minutesUsed){
        this.minutesUsed = minutesUsed;
    }

    public void setAllFields(int id, double baseCost, double allottedMinutes, double minutesUsed) {
        this.id = id;
        this.baseCost = baseCost;
        this.allottedMinutes = allottedMinutes;
        this.minutesUsed = minutesUsed;
    }

    public double calculateOverage() {
        if (minutesUsed > allottedMinutes) {
            var overageRate = .25;
            return (minutesUsed - allottedMinutes) * overageRate;
        }
        return 0;
    }

    public double calculateTax() {
        var taxRate = .15;
        return (calculateOverage() + baseCost) * taxRate;
    }

    public double calculateTotal() {
        return baseCost + calculateTax() + calculateOverage();
    }

    public void printItemizedBill() {
        System.out.printf("-------------------Client id: %d-------------------%n",id);
        System.out.printf("Phone bill statement: %nBase cost: $%.2f %nOverage: $%.2f %nTax: $%.2f %nTotal: $%.2f %n",
                baseCost, calculateOverage(), calculateTax(), calculateTotal());

    }

}
