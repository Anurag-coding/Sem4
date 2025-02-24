package com.hello;
class DVD extends Libraryresource {
    private int duration;
    public DVD(String title, String author, int duration) {
        super(title, author);
        this.duration = duration;
    }
	public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    @Override
    public void displayDetails() {
        System.out.println("DVD Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Duration (minutes): " + duration);
    }
}