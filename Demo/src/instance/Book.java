package instance;

   
	class Book {
	    static String libraryName;
	    String title;
	    String author;

	   

	    void displayInfo() {
	        System.out.println("Library Name : " + libraryName);
	        System.out.println("Book Title : " + title);
	        System.out.println("Book Author : " + author);
	        System.out.println("-------------------------");
	    }

	    public static void main(String[] args) {
	        Book.libraryName = "City Public Library";
	        Book book1 = new Book();
	        Book book2 = new Book();
	        book1.title="The Great Library";
	        book1.author="F.Scott Fitzerald";
	        book1.displayInfo();
	        
	        book2.title="1984";
	        book2.author="George Oewell";
	        book2.displayInfo();
	    }
	}

