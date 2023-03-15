import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Iterator;
import java.util.Random;

public class Box {
    private final int width;
    private final int height;
    private final List<Particle> particles;


    Random random = new Random();

    public Box(int width, int height) {
        this.width = width;
        this.height = height;
        this.particles = new ArrayList<>();
    }



    public void addParticle(Particle particle) {

        particles.add(particle);
    }

    public void size() {
        System.out.println(particles.size());
    }

    public void simulate() {
        boolean t=true;
        for(int k=0;k<100;k++) {
            for (Particle p : particles) {
                p.move(width,height);
            }


            for (int i = 0; i < particles.size(); i++) {

                for (int j = i + 1; j < particles.size(); j++) {
                    if (particles.get(i).collidesWith(particles.get(j))) {
                        System.out.println(particles.get(i).getX());
                        System.out.println(particles.get(i).getY());
                        int x = new Random().nextInt(width);
                        int y = new Random().nextInt(height);
                        particles.add( new Particle(x, y));
                        t=false;
                        break;
                    }
                }
            }
        }
        if(t){

                System.out.println("NOT COLLIDE");

        }
        }
public void numberparticle(){
        System.out.println(particles.size());
}
    }




