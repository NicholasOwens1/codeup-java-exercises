public class AbstractInterfacesLecture {
    public void main(String[] args) {
        Developer newGuy = new Developer("Nick", "Delivery");

    }

    abstract class Employee {
        protected String name;
        protected String department;

        public Employee(String name, String department) {
            this.name = name;
            this.department = department;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public abstract String work();
    }

    class Developer extends Employee {

        public Developer(String name, String department) {
            super(name, department);
        }

        @Override
        public String work() {
            return "Writing code...";
        }
    }
}

abstract class Notification {
    public abstract boolean didOptIn();
    public abstract String unsubscribeLink();
    public abstract String getPhysicalAddress();
    public abstract String getSenderInfo();
}