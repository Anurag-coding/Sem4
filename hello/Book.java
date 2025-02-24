package com.hello;
class Book extends Libraryresource {
	    private int pageCount;
	    public Book(String title, String author, int pageCount) {
	        super(title, author);
	        this.pageCount = pageCount;
	    }
	    public int getPageCount() {
	        return pageCount;
	    }

	    public void setPageCount(int pageCount) {
	        this.pageCount = pageCount;
	    }
	    @Override
	    public void displayDetails() {
	        System.out.println("Book Title: " + getTitle());
	        System.out.println("Author: " + getAuthor());
	        System.out.println("Page Count: " + pageCount);
	    }
	}


