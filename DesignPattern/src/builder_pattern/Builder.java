package builder_pattern;

public interface Builder {
    public void addSolute(double soluteAmount);
    public void addSolvent(double solventAmount);
    public void abondonSolution(double solutionAmount);
    public Object getResult();
}
