package builder_pattern;

public class Director {
    private Builder builder;
    public Director(Builder builder) {
        this.builder = builder;
    }
    public void constract() {
        builder.addSolvent(100);
        builder.addSolute(40);
        builder.abondonSolution(70);
        builder.addSolvent(100);
        builder.addSolute(15);
    }
}
