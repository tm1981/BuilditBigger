package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.v4.util.Pair;

import org.junit.Test;

import static org.junit.Assert.*;

public class EndpointsAsyncTaskTest {

    @Test
    public void testJoke(){
        EndpointsAsyncTask task = new EndpointsAsyncTask(new EndpointsAsyncTask.TaskCompleteListener() {
            @Override
            public void onTaskComplete(String result) {
                assertNotNull(result);
                assertTrue(!result.isEmpty());

            }
        });

        task.execute(new Pair<Context, String>(InstrumentationRegistry.getTargetContext(), "jock"));


    }
}