public  class StopWatch{
    long startTime;

    public long getEndTime() {
        return endTime;
    }
    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }
    long endTime;
    public long getStartTime() {
        return startTime;
    }
    public StopWatch() {
        startTime = System.currentTimeMillis();
    }
    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }
    public void starttime (){
        startTime = System.currentTimeMillis(); // gán cho thời gian hiện tại
    }
    public void start(){
        startTime = System.currentTimeMillis();//reset startTime về thời gian hiện tại của hệ thống
    }
    public void stop(){
        endTime = System.currentTimeMillis();// thiết đặt endTime về thời gian hiện tại của hệ thống
    }
    public long getElapsedTime() {
        return endTime - startTime; // trả về thời gian đã trôi qua (milisecond)
    }
}
