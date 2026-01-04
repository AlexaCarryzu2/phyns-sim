import java.util.ArrayList;
import java.util.List;

public class Simulator {
    private List<Particle> particles;

    public Simulator() {
        this.particles = new ArrayList<>();
    }

    // Method to add a particle to the simulation
    public void addParticle(Particle particle) {
        particles.add(particle);
    }

    // Method to simulate one time step
    public void simulateStep(double deltaTime) {
        for (Particle p : particles) {
            p.updatePosition(deltaTime);
            // Performance optimization: avoid unnecessary calculations if not needed.
            if (!p.isStatic()) {
                p.applyForces();
            }
        }
    }
}
