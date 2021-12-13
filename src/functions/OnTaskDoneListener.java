package functions;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}