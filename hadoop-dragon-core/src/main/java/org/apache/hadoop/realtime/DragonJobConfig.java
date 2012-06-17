/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.hadoop.realtime;

public class DragonJobConfig {

  public static final String JOB_SERVICE_CLASS = "dragon.job.service.class";

  public static final String ID = "dragon.job.id";

  public static final String JOB_NAME = "dragon.job.name";

  // This should be the name of the localized job-jar file on the node running
  // individual containers/tasks.
  public static final String JOB_JAR = "graphjob.jar";

  // Put all of the attribute names in here so that Job and JobContext are
  // consistent.
  public static final String JAR = "dragon.job.jar";

  public static final String JOB_SUBMIT_FILE_REPLICATION =
      "dragon.client.submit.file.replication";

  public static final String CHILD_JAVA_OPTS = "dragon.child.java.opts";

  // This should be the name of the localized job-configuration file on the node
  // running ApplicationMaster and Task
  public static final String JOB_CONF_FILE = "job.xml";

  public static final String USER_NAME = "dragon.job.user.name";

  public static final String PRIORITY = "dragon.job.priority";

  /* Entry class for child processes on each node */
  public static final String CHILD_CLASS =
      "org.apache.hadoop.realtime.DragonChild";

  public static final String JOB_SUBMITHOST = "dragon.job.submithostname";
  public static final String JOB_SUBMITHOSTADDR =
      "dragon.job.submithostaddress";

  public static final String JOB_NAMENODES = "dragon.job.hdfs-servers";

  /*
   * config for tracking the local file where all the credentials for the job
   * credentials.
   */
  public static final String DRAGON_JOB_CREDENTIALS_BINARY =
      "dragon.job.credentials.binary";

  public static final String DRAGON_JOB_CREDENTIALS_JSON =
      "dragon.job.credentials.json";

  public static final String QUEUE_NAME = "dragon.job.queuename";
  public static final String DEFAULT_QUEUE_NAME = "default";

  public static final String DRAGON_JOB_USER_CLASSPATH_FIRST =
      "dragon.job.user.classpath.first";

  public static final String CLASSPATH_ARCHIVES =
      "dragon.job.classpath.archives";

  public static final String CLASSPATH_FILES = "dragon.job.classpath.files";

  public static final String CACHE_FILES = "dragon.job.cache.files";

  public static final String CACHE_ARCHIVES = "dragon.job.cache.archives";

  public static final String CACHE_FILES_SIZES =
      "dragon.job.cache.files.filesizes"; // internal
                                          // use
                                          // only

  public static final String CACHE_ARCHIVES_SIZES =
      "dragon.job.cache.archives.filesizes"; // ditto

  public static final String CACHE_LOCALFILES = "dragon.job.cache.local.files";

  public static final String CACHE_LOCALARCHIVES =
      "dragon.job.cache.local.archives";

  public static final String CACHE_FILE_TIMESTAMPS =
      "dragon.job.cache.files.timestamps";

  public static final String CACHE_ARCHIVES_TIMESTAMPS =
      "dragon.job.cache.archives.timestamps";

  public static final String CACHE_FILE_VISIBILITIES =
      "dragon.job.cache.files.visibilities";

  public static final String CACHE_ARCHIVES_VISIBILITIES =
      "dragon.job.cache.archives.visibilities";

  public static final String CACHE_SYMLINK = "dragon.job.cache.symlink.create";

  public static final String TASK_USERLOG_LIMIT =
      "dragon.task.userlog.limit.kb";

  public static final String JOB_METAINFO = "job.metainfo";

  public static final String JOB_ACL_VIEW_JOB = "dragon.job.acl-view-job";

  public static final String DEFAULT_JOB_ACL_VIEW_JOB = " ";

  public static final String JOB_ACL_MODIFY_JOB = "dragon.job.acl-modify-job";

  public static final String DEFAULT_JOB_ACL_MODIFY_JOB = " ";

  public static final String JOB_CANCEL_DELEGATION_TOKEN =
      "dragon.job.complete.cancel.delegation.tokens";

  // This should be the directory where splits file gets localized on the node
  // running ApplicationMaster.
  public static final String JOB_SUBMIT_DIR = "graphJobSubmitDir";

  public static final String JOB_DESCRIPTION_FILE = "graphjob.desc";

  // The token file for the application. Should contain tokens for access to
  // remote file system and may optionally contain application specific tokens.
  // For now, generated by the AppManagers and used by NodeManagers and the
  // Containers.
  public static final String APPLICATION_TOKENS_FILE = "appTokens";

  public static final String APPLICATION_MASTER_CLASS =
      "org.apache.hadoop.realtime.server.DragonAppMaster";

  public static final String DRAGON_PREFIX = "yarn.app.dragon.";

  public static final String DRAGON_AM_PREFIX = DRAGON_PREFIX + "am.";

  /** Command line arguments passed to the DRAGON app master. */
  public static final String DRAGON_AM_COMMAND_OPTS = DRAGON_AM_PREFIX
      + "command-opts";
  public static final String DEFAULT_DRAGON_AM_COMMAND_OPTS = "-Xmx1536m";

  /** The amount of memory the DRAGON app master needs. */
  public static final String DRAGON_AM_VMEM_MB = DRAGON_AM_PREFIX
      + "resource.mb";
  public static final int DEFAULT_DRAGON_AM_VMEM_MB = 2048;

  /** Root Logging level passed to the DRAGON app master. */
  public static final String DRAGON_AM_LOG_LEVEL = DRAGON_AM_PREFIX
      + "log.level";
  public static final String DEFAULT_DRAGON_AM_LOG_LEVEL = "INFO";

  /** The log directory for the containers */
  public static final String TASK_LOG_DIR = DRAGON_PREFIX + "container.log.dir";

  public static final String TASK_LOG_SIZE = DRAGON_PREFIX
      + "container.log.filesize";

  /** The staging directory for dragon. */
  public static final String DRAGON_AM_STAGING_DIR = DRAGON_AM_PREFIX
      + "staging-dir";

  public static final String APPLICATION_ATTEMPT_ID =
      "dragon.job.application.attempt.id";

  /**
   * The number of client retires to the AM - before reconnecting to the RM to
   * fetch Application State.
   */
  public static final String DRAGON_CLIENT_TO_AM_IPC_MAX_RETRIES =
      DRAGON_PREFIX + "client-am.ipc.max-retries";
  public static final int DEFAULT_DRAGON_CLIENT_TO_AM_IPC_MAX_RETRIES = 3;

  /** AM ACL disabled. **/
  public static final String JOB_AM_ACCESS_DISABLED =
      "dragon.job.am-access-disabled";
  public static final boolean DEFAULT_JOB_AM_ACCESS_DISABLED = false;

  /** Number of threads to handle job client RPC requests. */
  public static final String DRAGON_AM_JOB_CLIENT_THREAD_COUNT =
      DRAGON_AM_PREFIX + "job.client.thread-count";
  public static final int DEFAULT_DRAGON_AM_JOB_CLIENT_THREAD_COUNT = 1;

  /*
   * Dragon AM Service Authorization
   */
  public static final String DRAGON_AM_SECURITY_SERVICE_AUTHORIZATION_TASK_UMBILICAL =
      "security.job.task.protocol.acl";
  public static final String DRAGON_AM_SECURITY_SERVICE_AUTHORIZATION_CLIENT =
      "security.job.client.protocol.acl";

  /**
   * Upper limit on the number of threads user to launch containers in the app
   * master. Expect level config, you shouldn't be needing it in most cases.
   */
  public static final String DRAGON_AM_CONTAINERLAUNCHER_THREAD_COUNT_LIMIT =
      DRAGON_AM_PREFIX + "containerlauncher.thread-count-limit";

  public static final int DEFAULT_DRAGON_AM_CONTAINERLAUNCHER_THREAD_COUNT_LIMIT =
      500;

  /** How often the AM should send heartbeats to the RM. */
  public static final String DRAGON_AM_TO_RM_HEARTBEAT_INTERVAL_MS =
      DRAGON_AM_PREFIX + "scheduler.heartbeat.interval-ms";
  public static final int DEFAULT_DRAGON_AM_TO_RM_HEARTBEAT_INTERVAL_MS = 1000;

  /** Enable blacklisting of nodes in the job. */
  public static final String DRAGON_AM_JOB_NODE_BLACKLISTING_ENABLE =
      DRAGON_AM_PREFIX + "job.node-blacklisting.enable";

  public static final String MAX_TASK_FAILURES_PER_TRACKER =
      "dragon.job.maxtaskfailures.per.tracker";

  /** Ignore blacklisting if a certain percentage of nodes have been blacklisted */
  public static final String DRAGON_AM_IGNORE_BLACKLISTING_BLACKLISTED_NODE_PERECENT =
      DRAGON_AM_PREFIX + "job.node-blacklisting.ignore-threshold-node-percent";
  public static final int DEFAULT_DRAGON_AM_IGNORE_BLACKLISTING_BLACKLISTED_NODE_PERCENT =
      33;

  /**
   * If contact with RM is lost, the AM will wait MR_AM_TO_RM_WAIT_INTERVAL_MS
   * milliseconds before aborting. During this interval, AM will still try to
   * contact the RM.
   */
  public static final String DRAGON_AM_TO_RM_WAIT_INTERVAL_MS =
      DRAGON_AM_PREFIX + "scheduler.connection.wait.interval-ms";
  public static final int DEFAULT_DRAGON_AM_TO_RM_WAIT_INTERVAL_MS = 360000;

  public static final String TASK_TIMEOUT = "dragon.task.timeout";

  public static final String TASK_TIMEOUT_CHECK_INTERVAL_MS =
      "dragon.task.timeout.check-interval-ms";

  /** The number of threads used to handle task RPC calls. */
  public static final String DRAGON_AM_TASK_LISTENER_THREAD_COUNT =
      DRAGON_AM_PREFIX + "job.task.listener.thread-count";

  public static final int DEFAULT_DRAGON_AM_TASK_LISTENER_THREAD_COUNT = 30;

  public static final String DRAGON_TASK_MAX_ATTEMPT = "task.max.attempt";
  public static final int DEFAULT_DRAGON_TASK_MAX_ATTEMPT = 1;

  public static final String DRAGON_ADMIN_USER_SHELL =
      "dragon.admin.user.shell";

  public static final String DEFAULT_SHELL = "/bin/bash";

  public static final String DRAGON_ADMIN_USER_ENV = "dragon.admin.user.env";

  public static final String DEFAULT_DRAGON_ADMIN_USER_ENV =
      "LD_LIBRARY_PATH=$HADOOP_COMMON_HOME/lib/native";

  public static final String DRAGON_REDUCE_ADMIN_JAVA_OPTS =
      "dragon.admin.reduce.child.java.opts";

  public static final String DEFAULT_DRAGON_ADMIN_JAVA_OPTS =
      "-Djava.net.preferIPv4Stack=true " + "-Dhadoop.metrics.log.level=WARN ";

  public static final String TASK_LOG_LEVEL = "dragon.reduce.log.level";

  public static final String DEFAULT_LOG_LEVEL = "INFO";

  public static final String DRAGON_TASK_ENV = "dragon.map.env";

  public static final String DEFAULT_DRAGON_TASK_ENV = "dragon.child.env";

  // Environment variables used by Pipes. (TODO: these
  // do not appear to be used by current pipes source code!)
  public static final String STDOUT_LOGFILE_ENV = "STDOUT_LOGFILE_ENV";
  public static final String STDERR_LOGFILE_ENV = "STDERR_LOGFILE_ENV";

  public static final String APPLICATION_ATTEMPT_ID_ENV =
      "APPLICATION_ATTEMPT_ID_ENV";

  public static final String DRAGON_TASK_JAVA_OPTS = "dragon.task.java.opts";
  public static final String DRAGON_ADMIN_JAVA_OPTS =
      "dragon.admin.task.child.java.opts";
  public static final String DEFAULT_DRAGON_TASK_JAVA_OPTS =
      "-Djava.net.preferIPv4Stack=true " + "-Dhadoop.metrics.log.level=WARN ";

  public static final String TASK_MEMORY_MB = "dragon.task.memory.mb";

  public static final int DEFAULT_TASK_MEMORY_MB = 1024;
  
  public static final String WORKING_DIR = "dragon.job.working.dir";
  
}
