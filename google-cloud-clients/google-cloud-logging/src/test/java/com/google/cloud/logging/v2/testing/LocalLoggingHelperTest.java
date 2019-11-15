package com.google.cloud.logging.v2.testing;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import com.google.cloud.NoCredentials;
import com.google.cloud.logging.LoggingOptions;
import org.junit.Test;

public class LocalLoggingHelperTest {

  private static final String PROJECT_ID_PREFIX = "test-project-";

  @Test
  public void testCreate() {
    LocalLoggingHelper helper = LocalLoggingHelper.create();
    assertTrue(helper.getOptions().getProjectId().startsWith(PROJECT_ID_PREFIX));
  }

  @Test
  public void testOptions() {
    LocalLoggingHelper helper = LocalLoggingHelper.create();
    LoggingOptions options = helper.getOptions();
    assertTrue(helper.getOptions().getProjectId().startsWith(PROJECT_ID_PREFIX));
    assertSame(helper.getOptions().getHost(), options.getHost());
    assertSame(NoCredentials.getInstance(), options.getCredentials());
    assertSame(helper.getOptions().getRetrySettings(), options.getRetrySettings());
  }
}
