package mx.edu.j2se.LilianaMartinezPelaez.tasks;

public class Task
{
    String title;
    int time;
    int start;
    int end;
    int interval;
    boolean active;
    boolean repeat;
    //int repeticion;

    //Constructor para tarea NO-RECURSIVA:
    public Task(String title, int time)
    {
        this.title = title;
        this.time = time;
    }

    //Constructor para tarea RECURSIVA:
    public Task(String title, int start, int end, int interval)
    {
        this.title = title;
        this.start = start;
        this.end = end;
        this.interval = interval;
    }

    //*********************************
    // CREACIÓN DE MÉTODOS            *
    // ********************************

    //Método para nombre del Task:
    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    //Métodos para estatus del Task:
    public boolean isActive() //es un getter
    {
        return active;
    }

    public void setActive(boolean active)
    {
        if (active != true)
        {
            System.out.println("Tarea inactiva");
        } else
            {
            this.active = active;
            }
    }


    //Métodos para tiempo de ejecución de task no-recursivo:
    public int getTime()
    {
        if (repeat != false)
        {
            return start;
        } else
        {
            return time;
        }

    }

    public void setTime(int time)
    {
        this.time = time;
    }

    //Métodos para ejecución de task recursivo:
    public int getStartTime()
    {
        if (repeat == false)
        {
            return time;
        } else
        {
            return start;
        }
    }

    public int getEndTime()
    {
        if (repeat == false)
        {
            return time;
        } else
        {
            return end;
        }
    }

    public int getRepeatInterval()
    {
        if (repeat == false)
        {
            return 0;
        } else
        {
            return interval;
        }
    }

    public void setTime(int start, int end, int interval)
    {
        if (repeat == false)
        {
            this.start = start;
            this.end = end;
            this.interval = interval;
        }
    }

    //Método para evaluar si el task es recursivo o no
    public boolean isRepeated() //get
    {
        return repeat;

    }

}

