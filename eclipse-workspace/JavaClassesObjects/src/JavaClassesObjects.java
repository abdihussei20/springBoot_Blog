
public class JavaClassesObjects {
	public static void main(String[] args) {
		
		
	}
	public class Pet {
		private String name;
		private int age;
		private String location;
		private String type;
		
		public Pet() {	
			name = "";
			age = 0;
			location = "";
			type = "";
		}
		
		public Pet(String name, int age, String location, String type) {
			this.name = name;
			this.age = age;
			this.location = location;
			this.type = type;
		}
		public int getAge() {
			return age;
		}
		
		public void setAge(int age ) {
			this.age = age;
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name ) {
			this.name = name;
		}

		public String getType() {
			return type;
		}
		public void setType(String type ) {
			this.type = type;
		}	
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
	}

	public class Holiday {
		private String name;
		private String figure;
		private String month;
		private int date;
		private int year;
		public String weather;
		public Holiday() {
		
		}
		public Holiday (String name, String figure, String month, int date, int year) {
			this.name = name;
			this.figure = figure;
			this.month = month;
			this.date = date;
			this.year = year;
		}
		public Holiday (String month, int date, int year) {
			this.date= date;
			this.month = month;
			this.year = year;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getfigure() {
			return figure;
		}
		public void setfigure(String figure) {
			this.figure = figure;
		}
		public String getMonth() {
			return month;
		}
		public void setMonth(String month) {
			this.month = month;
		}
		public int getDate() {
			return date;
		}
		public void setDate(int date) {
			this.date = date;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		public boolean holidayToday() {
			return true;
		}
		public String weather() {
			return "Whats the weather like?";
		}
	}

}
