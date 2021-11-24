package com.company;

public class Course
{
    private String name;
    private String topic;
    private String nameOfTeacher;
    private int numOfParticipants;
    public boolean hasParticipants;

    public Course (String var1, String var2, String var3, int var4, boolean var5)
    {
        this.name = var1;
        this.topic = var2;
        this.nameOfTeacher = var3;
        this.numOfParticipants = var4;
        this.hasParticipants = var5;
    }

    public String toString ()
    {
        if (numOfParticipants > 0)
            return name + ", " + topic + ", " + nameOfTeacher + "; " + "The number of participants: " + hasParticipants + ", " + numOfParticipants;
        else if (numOfParticipants < 0)
            return name + ", " + topic + ", " + nameOfTeacher + "; " + hasParticipants + ", " + "No participants in this course";
        return null;
    }

    // getters and setters ->

    public void setName(String name) {
        this.name = name;
    }
    public String getName () {
        return name;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
    public String getTopic() {
        return topic;
    }

    public void setNameOfTeacher(String nameOfTeacher) {
        this.nameOfTeacher = nameOfTeacher;
    }
    public String getNameOfTeacher() {
        return nameOfTeacher;
    }

    public void setNumOfParticipants (int numOfParticipants)
    {
        this.numOfParticipants = numOfParticipants;
    }
    public int getNumOfParticipants () {
        return numOfParticipants;
    }
}
