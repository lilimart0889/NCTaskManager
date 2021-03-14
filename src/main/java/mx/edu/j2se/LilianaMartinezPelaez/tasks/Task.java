package mx.edu.j2se.LilianaMartinezPelaez.tasks;

/*
@author LiliMP
Netcracker Training Program
Practical work no.1: Project Structure
*/

public class Task {

    //Instance variables
    String title;
    int time;
    int start;
    int end;
    int interval;
    int current;
    boolean active;
    boolean repeat;

    //Constructor for an inactive task to run at a specified time
    // without repeating with a given name.
    public Task(String title, int time) {
        this.title = title;
        this.time = time;
    }

    //Constructor for an inactive task to run within the specified time range
    // (including the start and the end time) with the set repetition interval and
    // with a given name.
    public Task(String title, int start, int end, int interval) {
        this.title = title;
        this.start = start;
        this.end = end;
        this.interval = interval;
    }

    //*********************************
    // METHODS                        *
    // ********************************

    //Reading and setting the task name.
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    //Reading and setting the task status.
    public boolean isActive() {
        if (time ==0 && start == 0) {
            System.out.print("Active task: ");
            return active = false;
        } else {
            System.out.print("Active task: ");
            return active = true;
        }
    }

    public void setActive(boolean active) {
            this.active = active;
    }

    //Methods for reading and changing execution time for non-repetitive tasks.
    public int getTime() {
        if (interval != 0) {  // Repetitive task
            System.out.print("Time: ");
            return start;
        } else { // Non-repetitive task
            System.out.print("Time: ");
            return time;
        }
    }

    public void setTime (int time) { // Change task performance to non-repetitive
        if (interval != 0 ) {
            this.end = 0;
            this.interval = 0;
            this.start = 0;
            this.time = time;
        }
    }

    //Methods for reading and changing execution time for repetitive tasks.
    public int getStartTime() {
        if (interval == 0) { // Non-repetitive task
            return time;
        } else { // Repetitive task
            return start;
        }
    }

    public int getEndTime() {
        if (interval == 0) { // Non-repetitive task
            return time;
        } else { // Repetitive task
            return end;
        }
    }

    public int getRepeatInterval() {
        if (interval == 0) { // Non-repetitive task
            return 0;
        } else { // Repetitive task
            return interval;
        }
    }

    public void setTime( int start, int end, int interval) { // Change task performance to repetitive
        if (time != 0 || time == 0) {
            this.end = end;
            this.interval = interval;
            this.start = start;
        }
    }

    //Method for checking the task for repeatability.
    public boolean isRepeated() {
        if (interval != 0){
            System.out.print("Repetitive task: ");
            return repeat = true;
        } else {
            System.out.print("Repetitive task: ");
            return repeat = false;
        }
    }

    //Method that returns the next start time of the task execution after the current time.
    public int nexTimeAfter(int current) {
        int nexttimeafter = 0;
        if (repeat == true && current != end) {
            for (int i = start; i <= current; i = i + interval) {
                nexttimeafter = interval + i;
            }
            return nexttimeafter;
        }
        return -1;
    }
}

