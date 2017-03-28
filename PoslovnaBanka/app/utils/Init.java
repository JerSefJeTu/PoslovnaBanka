package utils;

import models.Mesto;
import play.jobs.Job;
import play.jobs.OnApplicationStart;
import play.test.Fixtures;

/**
 * Created by stefan on 3/28/17.
 */
@OnApplicationStart
public class Init extends Job {

    public void doJob() {
        if(Mesto.count() == 0) {
            Fixtures.loadModels("initial-data.yml");
        }
    }

}
