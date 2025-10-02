
public class Counter {
    private int number;

    public Counter(int startValue){
        this.number = startValue;
    }

    public Counter(){
        this(0);
    }

    public int value(){
        return this.number;
    }
    public void decrease(int decreaseBy){
        if(decreaseBy<0) return;
        this.number -= decreaseBy;
    }

    public void decrease(){
        this.decrease(1);
    }
    public void increase(int increaseBy){
        if(increaseBy<0)return;
        this.number += increaseBy;
        return;
    }
    public void increase(){
        this.increase(1);
    }
}
