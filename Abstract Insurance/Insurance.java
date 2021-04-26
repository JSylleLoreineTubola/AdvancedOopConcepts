public abstract class Insurance {
    String policy;
    double monthly;


    public Insurance(String policy, double monthly) {
        this.policy = policy;
        this.monthly = monthly;
    }

    public String getTypeLife()
    {
        return policy;
    }
    
    public double getPriceLife()
    {
        return monthly;
    }
    
    public String getTypeHealth() {
        return policy;
    }
    
    public double getPriceHealth()
    {
        return monthly;
    }
    
    abstract void setCost();
    abstract void display();

}