class ProjectTest{
  public static void main(String[] args) {
    Project p = new Project();
    p.setName("Test 1");
    p.setDescription("Test 1 description");
    p.setCost(2.50f);
    p.elevatorPitch();

    Project q = new Project("Test 2");
    q.setCost(34.50f);
    q.elevatorPitch();

    Project r = new Project("Test 3", "Test 3 description");
    r.setCost(6.50f);
    r.elevatorPitch();

    Portfolio portfolio = new Portfolio();
    portfolio.addProject(p);
    portfolio.addProject(q);
    portfolio.addProject(r);

    portfolio.showPortfolio();


  }
}
