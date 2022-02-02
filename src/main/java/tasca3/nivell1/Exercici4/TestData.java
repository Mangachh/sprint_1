package tasca3.nivell1.Exercici4;

public class TestData implements Comparable<TestData> {
    
    private String name;
    private int position;

    public TestData(final String name, int position) {
        this.name = name;
        this.position = position;
    }

    public int getPosition() {
        return this.position;
    }

    @Override
    public String toString() {
        return String.format("%d %s", this.position, this.name);
    }

    @Override
    public int compareTo(TestData other) {
        if (other.getPosition() < this.position) {
            return 1;
        } else if (other.getPosition() == this.position) {
            return 0;
        } else {
            return -1;
        }
    }
}
