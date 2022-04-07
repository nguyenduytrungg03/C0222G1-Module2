package _04_class_java.exercise.stop_watch;

public class StopWatch {
    private double startTime;
    private double endTime;

    public StopWatch() {

    }

    public double getStartTime() {
        return startTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public double getElapsedTime() {
        return getEndTime() - getStartTime();
    }

}
