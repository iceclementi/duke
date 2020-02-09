public abstract class Task {
    protected String task;
    protected boolean isDone;

    public Task(String task) {
        this.task = task;
        this.isDone = false;
    }

    public String getTask() {
        return this.task;
    }

    public String getTaskStatus() {
        String icon = isDone ? "\u2713" : "\u2718";
        return ("[" + icon + "] " + task);
    }
}
