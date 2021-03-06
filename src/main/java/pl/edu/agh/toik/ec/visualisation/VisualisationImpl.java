package pl.edu.agh.toik.ec.visualisation;

/**
 * Created by baran on 09.05.17.
 */
public class VisualisationImpl implements Visualisation {

    private final VisualisationStrategy visualisationStrategy;
    private final VisualisationType visualisationType;

    public VisualisationImpl(VisualisationStrategy visualisationStrategy, VisualisationType visualisationType) {
        this.visualisationStrategy = visualisationStrategy;
        this.visualisationType = visualisationType;
    }

    @Override
    public void notify(String message) {

    }
}
