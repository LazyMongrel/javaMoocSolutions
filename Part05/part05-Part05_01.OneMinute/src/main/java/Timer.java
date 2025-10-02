public class Timer {
    private int hundredths;
    private int seconds;
    
    public Timer(){
        this.hundredths=0;
        this.seconds = 0;

    }

    public String toString(){
        String secondsStr = this.seconds < 10 ? "0" + this.seconds : "" + this.seconds;
        String hundredthsStr = this.hundredths < 10 ? "0" + this.hundredths : "" + this.hundredths;
        return secondsStr + ":" + hundredthsStr;
    }
    
    public void advance(){
        this.hundredths++;

        if(this.hundredths>=100){
            this.hundredths = 0;
            this.seconds++;

            if(this.seconds>=60){
                this.seconds=0;
            }
        }
    }
}
