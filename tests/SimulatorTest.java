import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class SimulatorTest {
private Simulator simulator;

@Before
public void setUp() throws Exception { 
simulator = new Simulator();
}

@Test
public void testAddParticle() { 
Particle particle = new Particle(1.0, new double[]{0.0, 0.0});
simulator.addParticle(particle);
assertEquals(1, simulator.getParticles().size());
}

@Test
public void testSimulateStep() { 
nparticle = new Particle(1.0, new double[]{5.0, 5.0});
simulator.addParticle(particle);
simulator.simulateStep(1.0);
asetEquals(new double[]{5.05, 5.05}, particle.getPosition(), 0.01); // Assuming some simple motion logic here.
}
b} 
