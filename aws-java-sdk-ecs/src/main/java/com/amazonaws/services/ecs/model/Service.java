/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details on a service within a cluster
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/Service" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Service implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN that identifies the service. The ARN contains the <code>arn:aws:ecs</code> namespace, followed by the
     * region of the service, the AWS account ID of the service owner, the <code>service</code> namespace, and then the
     * service name. For example, <code>arn:aws:ecs:<i>region</i>:<i>012345678910</i>:service/<i>my-service</i> </code>.
     * </p>
     */
    private String serviceArn;
    /**
     * <p>
     * The name of your service. Up to 255 letters (uppercase and lowercase), numbers, hyphens, and underscores are
     * allowed. Service names must be unique within a cluster, but you can have similarly named services in multiple
     * clusters within a region or across multiple regions.
     * </p>
     */
    private String serviceName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster that hosts the service.
     * </p>
     */
    private String clusterArn;
    /**
     * <p>
     * A list of Elastic Load Balancing load balancer objects, containing the load balancer name, the container name (as
     * it appears in a container definition), and the container port to access from the load balancer.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<LoadBalancer> loadBalancers;
    /**
     * <p>
     * The status of the service. The valid values are <code>ACTIVE</code>, <code>DRAINING</code>, or
     * <code>INACTIVE</code>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The desired number of instantiations of the task definition to keep running on the service. This value is
     * specified when the service is created with <a>CreateService</a>, and it can be modified with
     * <a>UpdateService</a>.
     * </p>
     */
    private Integer desiredCount;
    /**
     * <p>
     * The number of tasks in the cluster that are in the <code>RUNNING</code> state.
     * </p>
     */
    private Integer runningCount;
    /**
     * <p>
     * The number of tasks in the cluster that are in the <code>PENDING</code> state.
     * </p>
     */
    private Integer pendingCount;
    /**
     * <p>
     * The launch type on which your service is running.
     * </p>
     */
    private String launchType;
    /**
     * <p>
     * The platform version on which your task is running. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate Platform
     * Versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     */
    private String platformVersion;
    /**
     * <p>
     * The task definition to use for tasks in the service. This value is specified when the service is created with
     * <a>CreateService</a>, and it can be modified with <a>UpdateService</a>.
     * </p>
     */
    private String taskDefinition;
    /**
     * <p>
     * Optional deployment parameters that control how many tasks run during the deployment and the ordering of stopping
     * and starting tasks.
     * </p>
     */
    private DeploymentConfiguration deploymentConfiguration;
    /**
     * <p>
     * The current state of deployments for the service.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Deployment> deployments;
    /**
     * <p>
     * The ARN of the IAM role associated with the service that allows the Amazon ECS container agent to register
     * container instances with an Elastic Load Balancing load balancer.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The event stream for your service. A maximum of 100 of the latest events are displayed.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ServiceEvent> events;
    /**
     * <p>
     * The Unix time stamp for when the service was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The placement constraints for the tasks in the service.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PlacementConstraint> placementConstraints;
    /**
     * <p>
     * The placement strategy that determines how tasks for the service are placed.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PlacementStrategy> placementStrategy;
    /**
     * <p>
     * The VPC subnet and security group configuration for tasks that receive their own Elastic Network Interface by
     * using the <code>awsvpc</code> networking mode.
     * </p>
     */
    private NetworkConfiguration networkConfiguration;
    /**
     * <p>
     * The period of time, in seconds, that the Amazon ECS service scheduler ignores unhealthy Elastic Load Balancing
     * target health checks after a task has first started.
     * </p>
     */
    private Integer healthCheckGracePeriodSeconds;

    /**
     * <p>
     * The ARN that identifies the service. The ARN contains the <code>arn:aws:ecs</code> namespace, followed by the
     * region of the service, the AWS account ID of the service owner, the <code>service</code> namespace, and then the
     * service name. For example, <code>arn:aws:ecs:<i>region</i>:<i>012345678910</i>:service/<i>my-service</i> </code>.
     * </p>
     * 
     * @param serviceArn
     *        The ARN that identifies the service. The ARN contains the <code>arn:aws:ecs</code> namespace, followed by
     *        the region of the service, the AWS account ID of the service owner, the <code>service</code> namespace,
     *        and then the service name. For example,
     *        <code>arn:aws:ecs:<i>region</i>:<i>012345678910</i>:service/<i>my-service</i> </code>.
     */

    public void setServiceArn(String serviceArn) {
        this.serviceArn = serviceArn;
    }

    /**
     * <p>
     * The ARN that identifies the service. The ARN contains the <code>arn:aws:ecs</code> namespace, followed by the
     * region of the service, the AWS account ID of the service owner, the <code>service</code> namespace, and then the
     * service name. For example, <code>arn:aws:ecs:<i>region</i>:<i>012345678910</i>:service/<i>my-service</i> </code>.
     * </p>
     * 
     * @return The ARN that identifies the service. The ARN contains the <code>arn:aws:ecs</code> namespace, followed by
     *         the region of the service, the AWS account ID of the service owner, the <code>service</code> namespace,
     *         and then the service name. For example,
     *         <code>arn:aws:ecs:<i>region</i>:<i>012345678910</i>:service/<i>my-service</i> </code>.
     */

    public String getServiceArn() {
        return this.serviceArn;
    }

    /**
     * <p>
     * The ARN that identifies the service. The ARN contains the <code>arn:aws:ecs</code> namespace, followed by the
     * region of the service, the AWS account ID of the service owner, the <code>service</code> namespace, and then the
     * service name. For example, <code>arn:aws:ecs:<i>region</i>:<i>012345678910</i>:service/<i>my-service</i> </code>.
     * </p>
     * 
     * @param serviceArn
     *        The ARN that identifies the service. The ARN contains the <code>arn:aws:ecs</code> namespace, followed by
     *        the region of the service, the AWS account ID of the service owner, the <code>service</code> namespace,
     *        and then the service name. For example,
     *        <code>arn:aws:ecs:<i>region</i>:<i>012345678910</i>:service/<i>my-service</i> </code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withServiceArn(String serviceArn) {
        setServiceArn(serviceArn);
        return this;
    }

    /**
     * <p>
     * The name of your service. Up to 255 letters (uppercase and lowercase), numbers, hyphens, and underscores are
     * allowed. Service names must be unique within a cluster, but you can have similarly named services in multiple
     * clusters within a region or across multiple regions.
     * </p>
     * 
     * @param serviceName
     *        The name of your service. Up to 255 letters (uppercase and lowercase), numbers, hyphens, and underscores
     *        are allowed. Service names must be unique within a cluster, but you can have similarly named services in
     *        multiple clusters within a region or across multiple regions.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of your service. Up to 255 letters (uppercase and lowercase), numbers, hyphens, and underscores are
     * allowed. Service names must be unique within a cluster, but you can have similarly named services in multiple
     * clusters within a region or across multiple regions.
     * </p>
     * 
     * @return The name of your service. Up to 255 letters (uppercase and lowercase), numbers, hyphens, and underscores
     *         are allowed. Service names must be unique within a cluster, but you can have similarly named services in
     *         multiple clusters within a region or across multiple regions.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * The name of your service. Up to 255 letters (uppercase and lowercase), numbers, hyphens, and underscores are
     * allowed. Service names must be unique within a cluster, but you can have similarly named services in multiple
     * clusters within a region or across multiple regions.
     * </p>
     * 
     * @param serviceName
     *        The name of your service. Up to 255 letters (uppercase and lowercase), numbers, hyphens, and underscores
     *        are allowed. Service names must be unique within a cluster, but you can have similarly named services in
     *        multiple clusters within a region or across multiple regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withServiceName(String serviceName) {
        setServiceName(serviceName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster that hosts the service.
     * </p>
     * 
     * @param clusterArn
     *        The Amazon Resource Name (ARN) of the cluster that hosts the service.
     */

    public void setClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster that hosts the service.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the cluster that hosts the service.
     */

    public String getClusterArn() {
        return this.clusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster that hosts the service.
     * </p>
     * 
     * @param clusterArn
     *        The Amazon Resource Name (ARN) of the cluster that hosts the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withClusterArn(String clusterArn) {
        setClusterArn(clusterArn);
        return this;
    }

    /**
     * <p>
     * A list of Elastic Load Balancing load balancer objects, containing the load balancer name, the container name (as
     * it appears in a container definition), and the container port to access from the load balancer.
     * </p>
     * 
     * @return A list of Elastic Load Balancing load balancer objects, containing the load balancer name, the container
     *         name (as it appears in a container definition), and the container port to access from the load balancer.
     */

    public java.util.List<LoadBalancer> getLoadBalancers() {
        if (loadBalancers == null) {
            loadBalancers = new com.amazonaws.internal.SdkInternalList<LoadBalancer>();
        }
        return loadBalancers;
    }

    /**
     * <p>
     * A list of Elastic Load Balancing load balancer objects, containing the load balancer name, the container name (as
     * it appears in a container definition), and the container port to access from the load balancer.
     * </p>
     * 
     * @param loadBalancers
     *        A list of Elastic Load Balancing load balancer objects, containing the load balancer name, the container
     *        name (as it appears in a container definition), and the container port to access from the load balancer.
     */

    public void setLoadBalancers(java.util.Collection<LoadBalancer> loadBalancers) {
        if (loadBalancers == null) {
            this.loadBalancers = null;
            return;
        }

        this.loadBalancers = new com.amazonaws.internal.SdkInternalList<LoadBalancer>(loadBalancers);
    }

    /**
     * <p>
     * A list of Elastic Load Balancing load balancer objects, containing the load balancer name, the container name (as
     * it appears in a container definition), and the container port to access from the load balancer.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLoadBalancers(java.util.Collection)} or {@link #withLoadBalancers(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param loadBalancers
     *        A list of Elastic Load Balancing load balancer objects, containing the load balancer name, the container
     *        name (as it appears in a container definition), and the container port to access from the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withLoadBalancers(LoadBalancer... loadBalancers) {
        if (this.loadBalancers == null) {
            setLoadBalancers(new com.amazonaws.internal.SdkInternalList<LoadBalancer>(loadBalancers.length));
        }
        for (LoadBalancer ele : loadBalancers) {
            this.loadBalancers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of Elastic Load Balancing load balancer objects, containing the load balancer name, the container name (as
     * it appears in a container definition), and the container port to access from the load balancer.
     * </p>
     * 
     * @param loadBalancers
     *        A list of Elastic Load Balancing load balancer objects, containing the load balancer name, the container
     *        name (as it appears in a container definition), and the container port to access from the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withLoadBalancers(java.util.Collection<LoadBalancer> loadBalancers) {
        setLoadBalancers(loadBalancers);
        return this;
    }

    /**
     * <p>
     * The status of the service. The valid values are <code>ACTIVE</code>, <code>DRAINING</code>, or
     * <code>INACTIVE</code>.
     * </p>
     * 
     * @param status
     *        The status of the service. The valid values are <code>ACTIVE</code>, <code>DRAINING</code>, or
     *        <code>INACTIVE</code>.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the service. The valid values are <code>ACTIVE</code>, <code>DRAINING</code>, or
     * <code>INACTIVE</code>.
     * </p>
     * 
     * @return The status of the service. The valid values are <code>ACTIVE</code>, <code>DRAINING</code>, or
     *         <code>INACTIVE</code>.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the service. The valid values are <code>ACTIVE</code>, <code>DRAINING</code>, or
     * <code>INACTIVE</code>.
     * </p>
     * 
     * @param status
     *        The status of the service. The valid values are <code>ACTIVE</code>, <code>DRAINING</code>, or
     *        <code>INACTIVE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The desired number of instantiations of the task definition to keep running on the service. This value is
     * specified when the service is created with <a>CreateService</a>, and it can be modified with
     * <a>UpdateService</a>.
     * </p>
     * 
     * @param desiredCount
     *        The desired number of instantiations of the task definition to keep running on the service. This value is
     *        specified when the service is created with <a>CreateService</a>, and it can be modified with
     *        <a>UpdateService</a>.
     */

    public void setDesiredCount(Integer desiredCount) {
        this.desiredCount = desiredCount;
    }

    /**
     * <p>
     * The desired number of instantiations of the task definition to keep running on the service. This value is
     * specified when the service is created with <a>CreateService</a>, and it can be modified with
     * <a>UpdateService</a>.
     * </p>
     * 
     * @return The desired number of instantiations of the task definition to keep running on the service. This value is
     *         specified when the service is created with <a>CreateService</a>, and it can be modified with
     *         <a>UpdateService</a>.
     */

    public Integer getDesiredCount() {
        return this.desiredCount;
    }

    /**
     * <p>
     * The desired number of instantiations of the task definition to keep running on the service. This value is
     * specified when the service is created with <a>CreateService</a>, and it can be modified with
     * <a>UpdateService</a>.
     * </p>
     * 
     * @param desiredCount
     *        The desired number of instantiations of the task definition to keep running on the service. This value is
     *        specified when the service is created with <a>CreateService</a>, and it can be modified with
     *        <a>UpdateService</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withDesiredCount(Integer desiredCount) {
        setDesiredCount(desiredCount);
        return this;
    }

    /**
     * <p>
     * The number of tasks in the cluster that are in the <code>RUNNING</code> state.
     * </p>
     * 
     * @param runningCount
     *        The number of tasks in the cluster that are in the <code>RUNNING</code> state.
     */

    public void setRunningCount(Integer runningCount) {
        this.runningCount = runningCount;
    }

    /**
     * <p>
     * The number of tasks in the cluster that are in the <code>RUNNING</code> state.
     * </p>
     * 
     * @return The number of tasks in the cluster that are in the <code>RUNNING</code> state.
     */

    public Integer getRunningCount() {
        return this.runningCount;
    }

    /**
     * <p>
     * The number of tasks in the cluster that are in the <code>RUNNING</code> state.
     * </p>
     * 
     * @param runningCount
     *        The number of tasks in the cluster that are in the <code>RUNNING</code> state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withRunningCount(Integer runningCount) {
        setRunningCount(runningCount);
        return this;
    }

    /**
     * <p>
     * The number of tasks in the cluster that are in the <code>PENDING</code> state.
     * </p>
     * 
     * @param pendingCount
     *        The number of tasks in the cluster that are in the <code>PENDING</code> state.
     */

    public void setPendingCount(Integer pendingCount) {
        this.pendingCount = pendingCount;
    }

    /**
     * <p>
     * The number of tasks in the cluster that are in the <code>PENDING</code> state.
     * </p>
     * 
     * @return The number of tasks in the cluster that are in the <code>PENDING</code> state.
     */

    public Integer getPendingCount() {
        return this.pendingCount;
    }

    /**
     * <p>
     * The number of tasks in the cluster that are in the <code>PENDING</code> state.
     * </p>
     * 
     * @param pendingCount
     *        The number of tasks in the cluster that are in the <code>PENDING</code> state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withPendingCount(Integer pendingCount) {
        setPendingCount(pendingCount);
        return this;
    }

    /**
     * <p>
     * The launch type on which your service is running.
     * </p>
     * 
     * @param launchType
     *        The launch type on which your service is running.
     * @see LaunchType
     */

    public void setLaunchType(String launchType) {
        this.launchType = launchType;
    }

    /**
     * <p>
     * The launch type on which your service is running.
     * </p>
     * 
     * @return The launch type on which your service is running.
     * @see LaunchType
     */

    public String getLaunchType() {
        return this.launchType;
    }

    /**
     * <p>
     * The launch type on which your service is running.
     * </p>
     * 
     * @param launchType
     *        The launch type on which your service is running.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchType
     */

    public Service withLaunchType(String launchType) {
        setLaunchType(launchType);
        return this;
    }

    /**
     * <p>
     * The launch type on which your service is running.
     * </p>
     * 
     * @param launchType
     *        The launch type on which your service is running.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchType
     */

    public Service withLaunchType(LaunchType launchType) {
        this.launchType = launchType.toString();
        return this;
    }

    /**
     * <p>
     * The platform version on which your task is running. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate Platform
     * Versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param platformVersion
     *        The platform version on which your task is running. For more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate
     *        Platform Versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public void setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
    }

    /**
     * <p>
     * The platform version on which your task is running. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate Platform
     * Versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @return The platform version on which your task is running. For more information, see <a
     *         href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate
     *         Platform Versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public String getPlatformVersion() {
        return this.platformVersion;
    }

    /**
     * <p>
     * The platform version on which your task is running. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate Platform
     * Versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param platformVersion
     *        The platform version on which your task is running. For more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate
     *        Platform Versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withPlatformVersion(String platformVersion) {
        setPlatformVersion(platformVersion);
        return this;
    }

    /**
     * <p>
     * The task definition to use for tasks in the service. This value is specified when the service is created with
     * <a>CreateService</a>, and it can be modified with <a>UpdateService</a>.
     * </p>
     * 
     * @param taskDefinition
     *        The task definition to use for tasks in the service. This value is specified when the service is created
     *        with <a>CreateService</a>, and it can be modified with <a>UpdateService</a>.
     */

    public void setTaskDefinition(String taskDefinition) {
        this.taskDefinition = taskDefinition;
    }

    /**
     * <p>
     * The task definition to use for tasks in the service. This value is specified when the service is created with
     * <a>CreateService</a>, and it can be modified with <a>UpdateService</a>.
     * </p>
     * 
     * @return The task definition to use for tasks in the service. This value is specified when the service is created
     *         with <a>CreateService</a>, and it can be modified with <a>UpdateService</a>.
     */

    public String getTaskDefinition() {
        return this.taskDefinition;
    }

    /**
     * <p>
     * The task definition to use for tasks in the service. This value is specified when the service is created with
     * <a>CreateService</a>, and it can be modified with <a>UpdateService</a>.
     * </p>
     * 
     * @param taskDefinition
     *        The task definition to use for tasks in the service. This value is specified when the service is created
     *        with <a>CreateService</a>, and it can be modified with <a>UpdateService</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withTaskDefinition(String taskDefinition) {
        setTaskDefinition(taskDefinition);
        return this;
    }

    /**
     * <p>
     * Optional deployment parameters that control how many tasks run during the deployment and the ordering of stopping
     * and starting tasks.
     * </p>
     * 
     * @param deploymentConfiguration
     *        Optional deployment parameters that control how many tasks run during the deployment and the ordering of
     *        stopping and starting tasks.
     */

    public void setDeploymentConfiguration(DeploymentConfiguration deploymentConfiguration) {
        this.deploymentConfiguration = deploymentConfiguration;
    }

    /**
     * <p>
     * Optional deployment parameters that control how many tasks run during the deployment and the ordering of stopping
     * and starting tasks.
     * </p>
     * 
     * @return Optional deployment parameters that control how many tasks run during the deployment and the ordering of
     *         stopping and starting tasks.
     */

    public DeploymentConfiguration getDeploymentConfiguration() {
        return this.deploymentConfiguration;
    }

    /**
     * <p>
     * Optional deployment parameters that control how many tasks run during the deployment and the ordering of stopping
     * and starting tasks.
     * </p>
     * 
     * @param deploymentConfiguration
     *        Optional deployment parameters that control how many tasks run during the deployment and the ordering of
     *        stopping and starting tasks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withDeploymentConfiguration(DeploymentConfiguration deploymentConfiguration) {
        setDeploymentConfiguration(deploymentConfiguration);
        return this;
    }

    /**
     * <p>
     * The current state of deployments for the service.
     * </p>
     * 
     * @return The current state of deployments for the service.
     */

    public java.util.List<Deployment> getDeployments() {
        if (deployments == null) {
            deployments = new com.amazonaws.internal.SdkInternalList<Deployment>();
        }
        return deployments;
    }

    /**
     * <p>
     * The current state of deployments for the service.
     * </p>
     * 
     * @param deployments
     *        The current state of deployments for the service.
     */

    public void setDeployments(java.util.Collection<Deployment> deployments) {
        if (deployments == null) {
            this.deployments = null;
            return;
        }

        this.deployments = new com.amazonaws.internal.SdkInternalList<Deployment>(deployments);
    }

    /**
     * <p>
     * The current state of deployments for the service.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeployments(java.util.Collection)} or {@link #withDeployments(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param deployments
     *        The current state of deployments for the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withDeployments(Deployment... deployments) {
        if (this.deployments == null) {
            setDeployments(new com.amazonaws.internal.SdkInternalList<Deployment>(deployments.length));
        }
        for (Deployment ele : deployments) {
            this.deployments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The current state of deployments for the service.
     * </p>
     * 
     * @param deployments
     *        The current state of deployments for the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withDeployments(java.util.Collection<Deployment> deployments) {
        setDeployments(deployments);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM role associated with the service that allows the Amazon ECS container agent to register
     * container instances with an Elastic Load Balancing load balancer.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM role associated with the service that allows the Amazon ECS container agent to register
     *        container instances with an Elastic Load Balancing load balancer.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role associated with the service that allows the Amazon ECS container agent to register
     * container instances with an Elastic Load Balancing load balancer.
     * </p>
     * 
     * @return The ARN of the IAM role associated with the service that allows the Amazon ECS container agent to
     *         register container instances with an Elastic Load Balancing load balancer.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role associated with the service that allows the Amazon ECS container agent to register
     * container instances with an Elastic Load Balancing load balancer.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM role associated with the service that allows the Amazon ECS container agent to register
     *        container instances with an Elastic Load Balancing load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The event stream for your service. A maximum of 100 of the latest events are displayed.
     * </p>
     * 
     * @return The event stream for your service. A maximum of 100 of the latest events are displayed.
     */

    public java.util.List<ServiceEvent> getEvents() {
        if (events == null) {
            events = new com.amazonaws.internal.SdkInternalList<ServiceEvent>();
        }
        return events;
    }

    /**
     * <p>
     * The event stream for your service. A maximum of 100 of the latest events are displayed.
     * </p>
     * 
     * @param events
     *        The event stream for your service. A maximum of 100 of the latest events are displayed.
     */

    public void setEvents(java.util.Collection<ServiceEvent> events) {
        if (events == null) {
            this.events = null;
            return;
        }

        this.events = new com.amazonaws.internal.SdkInternalList<ServiceEvent>(events);
    }

    /**
     * <p>
     * The event stream for your service. A maximum of 100 of the latest events are displayed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEvents(java.util.Collection)} or {@link #withEvents(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param events
     *        The event stream for your service. A maximum of 100 of the latest events are displayed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withEvents(ServiceEvent... events) {
        if (this.events == null) {
            setEvents(new com.amazonaws.internal.SdkInternalList<ServiceEvent>(events.length));
        }
        for (ServiceEvent ele : events) {
            this.events.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The event stream for your service. A maximum of 100 of the latest events are displayed.
     * </p>
     * 
     * @param events
     *        The event stream for your service. A maximum of 100 of the latest events are displayed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withEvents(java.util.Collection<ServiceEvent> events) {
        setEvents(events);
        return this;
    }

    /**
     * <p>
     * The Unix time stamp for when the service was created.
     * </p>
     * 
     * @param createdAt
     *        The Unix time stamp for when the service was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The Unix time stamp for when the service was created.
     * </p>
     * 
     * @return The Unix time stamp for when the service was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The Unix time stamp for when the service was created.
     * </p>
     * 
     * @param createdAt
     *        The Unix time stamp for when the service was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The placement constraints for the tasks in the service.
     * </p>
     * 
     * @return The placement constraints for the tasks in the service.
     */

    public java.util.List<PlacementConstraint> getPlacementConstraints() {
        if (placementConstraints == null) {
            placementConstraints = new com.amazonaws.internal.SdkInternalList<PlacementConstraint>();
        }
        return placementConstraints;
    }

    /**
     * <p>
     * The placement constraints for the tasks in the service.
     * </p>
     * 
     * @param placementConstraints
     *        The placement constraints for the tasks in the service.
     */

    public void setPlacementConstraints(java.util.Collection<PlacementConstraint> placementConstraints) {
        if (placementConstraints == null) {
            this.placementConstraints = null;
            return;
        }

        this.placementConstraints = new com.amazonaws.internal.SdkInternalList<PlacementConstraint>(placementConstraints);
    }

    /**
     * <p>
     * The placement constraints for the tasks in the service.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPlacementConstraints(java.util.Collection)} or {@link #withPlacementConstraints(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param placementConstraints
     *        The placement constraints for the tasks in the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withPlacementConstraints(PlacementConstraint... placementConstraints) {
        if (this.placementConstraints == null) {
            setPlacementConstraints(new com.amazonaws.internal.SdkInternalList<PlacementConstraint>(placementConstraints.length));
        }
        for (PlacementConstraint ele : placementConstraints) {
            this.placementConstraints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The placement constraints for the tasks in the service.
     * </p>
     * 
     * @param placementConstraints
     *        The placement constraints for the tasks in the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withPlacementConstraints(java.util.Collection<PlacementConstraint> placementConstraints) {
        setPlacementConstraints(placementConstraints);
        return this;
    }

    /**
     * <p>
     * The placement strategy that determines how tasks for the service are placed.
     * </p>
     * 
     * @return The placement strategy that determines how tasks for the service are placed.
     */

    public java.util.List<PlacementStrategy> getPlacementStrategy() {
        if (placementStrategy == null) {
            placementStrategy = new com.amazonaws.internal.SdkInternalList<PlacementStrategy>();
        }
        return placementStrategy;
    }

    /**
     * <p>
     * The placement strategy that determines how tasks for the service are placed.
     * </p>
     * 
     * @param placementStrategy
     *        The placement strategy that determines how tasks for the service are placed.
     */

    public void setPlacementStrategy(java.util.Collection<PlacementStrategy> placementStrategy) {
        if (placementStrategy == null) {
            this.placementStrategy = null;
            return;
        }

        this.placementStrategy = new com.amazonaws.internal.SdkInternalList<PlacementStrategy>(placementStrategy);
    }

    /**
     * <p>
     * The placement strategy that determines how tasks for the service are placed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPlacementStrategy(java.util.Collection)} or {@link #withPlacementStrategy(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param placementStrategy
     *        The placement strategy that determines how tasks for the service are placed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withPlacementStrategy(PlacementStrategy... placementStrategy) {
        if (this.placementStrategy == null) {
            setPlacementStrategy(new com.amazonaws.internal.SdkInternalList<PlacementStrategy>(placementStrategy.length));
        }
        for (PlacementStrategy ele : placementStrategy) {
            this.placementStrategy.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The placement strategy that determines how tasks for the service are placed.
     * </p>
     * 
     * @param placementStrategy
     *        The placement strategy that determines how tasks for the service are placed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withPlacementStrategy(java.util.Collection<PlacementStrategy> placementStrategy) {
        setPlacementStrategy(placementStrategy);
        return this;
    }

    /**
     * <p>
     * The VPC subnet and security group configuration for tasks that receive their own Elastic Network Interface by
     * using the <code>awsvpc</code> networking mode.
     * </p>
     * 
     * @param networkConfiguration
     *        The VPC subnet and security group configuration for tasks that receive their own Elastic Network Interface
     *        by using the <code>awsvpc</code> networking mode.
     */

    public void setNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
    }

    /**
     * <p>
     * The VPC subnet and security group configuration for tasks that receive their own Elastic Network Interface by
     * using the <code>awsvpc</code> networking mode.
     * </p>
     * 
     * @return The VPC subnet and security group configuration for tasks that receive their own Elastic Network
     *         Interface by using the <code>awsvpc</code> networking mode.
     */

    public NetworkConfiguration getNetworkConfiguration() {
        return this.networkConfiguration;
    }

    /**
     * <p>
     * The VPC subnet and security group configuration for tasks that receive their own Elastic Network Interface by
     * using the <code>awsvpc</code> networking mode.
     * </p>
     * 
     * @param networkConfiguration
     *        The VPC subnet and security group configuration for tasks that receive their own Elastic Network Interface
     *        by using the <code>awsvpc</code> networking mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        setNetworkConfiguration(networkConfiguration);
        return this;
    }

    /**
     * <p>
     * The period of time, in seconds, that the Amazon ECS service scheduler ignores unhealthy Elastic Load Balancing
     * target health checks after a task has first started.
     * </p>
     * 
     * @param healthCheckGracePeriodSeconds
     *        The period of time, in seconds, that the Amazon ECS service scheduler ignores unhealthy Elastic Load
     *        Balancing target health checks after a task has first started.
     */

    public void setHealthCheckGracePeriodSeconds(Integer healthCheckGracePeriodSeconds) {
        this.healthCheckGracePeriodSeconds = healthCheckGracePeriodSeconds;
    }

    /**
     * <p>
     * The period of time, in seconds, that the Amazon ECS service scheduler ignores unhealthy Elastic Load Balancing
     * target health checks after a task has first started.
     * </p>
     * 
     * @return The period of time, in seconds, that the Amazon ECS service scheduler ignores unhealthy Elastic Load
     *         Balancing target health checks after a task has first started.
     */

    public Integer getHealthCheckGracePeriodSeconds() {
        return this.healthCheckGracePeriodSeconds;
    }

    /**
     * <p>
     * The period of time, in seconds, that the Amazon ECS service scheduler ignores unhealthy Elastic Load Balancing
     * target health checks after a task has first started.
     * </p>
     * 
     * @param healthCheckGracePeriodSeconds
     *        The period of time, in seconds, that the Amazon ECS service scheduler ignores unhealthy Elastic Load
     *        Balancing target health checks after a task has first started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withHealthCheckGracePeriodSeconds(Integer healthCheckGracePeriodSeconds) {
        setHealthCheckGracePeriodSeconds(healthCheckGracePeriodSeconds);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getServiceArn() != null)
            sb.append("ServiceArn: ").append(getServiceArn()).append(",");
        if (getServiceName() != null)
            sb.append("ServiceName: ").append(getServiceName()).append(",");
        if (getClusterArn() != null)
            sb.append("ClusterArn: ").append(getClusterArn()).append(",");
        if (getLoadBalancers() != null)
            sb.append("LoadBalancers: ").append(getLoadBalancers()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getDesiredCount() != null)
            sb.append("DesiredCount: ").append(getDesiredCount()).append(",");
        if (getRunningCount() != null)
            sb.append("RunningCount: ").append(getRunningCount()).append(",");
        if (getPendingCount() != null)
            sb.append("PendingCount: ").append(getPendingCount()).append(",");
        if (getLaunchType() != null)
            sb.append("LaunchType: ").append(getLaunchType()).append(",");
        if (getPlatformVersion() != null)
            sb.append("PlatformVersion: ").append(getPlatformVersion()).append(",");
        if (getTaskDefinition() != null)
            sb.append("TaskDefinition: ").append(getTaskDefinition()).append(",");
        if (getDeploymentConfiguration() != null)
            sb.append("DeploymentConfiguration: ").append(getDeploymentConfiguration()).append(",");
        if (getDeployments() != null)
            sb.append("Deployments: ").append(getDeployments()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getEvents() != null)
            sb.append("Events: ").append(getEvents()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getPlacementConstraints() != null)
            sb.append("PlacementConstraints: ").append(getPlacementConstraints()).append(",");
        if (getPlacementStrategy() != null)
            sb.append("PlacementStrategy: ").append(getPlacementStrategy()).append(",");
        if (getNetworkConfiguration() != null)
            sb.append("NetworkConfiguration: ").append(getNetworkConfiguration()).append(",");
        if (getHealthCheckGracePeriodSeconds() != null)
            sb.append("HealthCheckGracePeriodSeconds: ").append(getHealthCheckGracePeriodSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Service == false)
            return false;
        Service other = (Service) obj;
        if (other.getServiceArn() == null ^ this.getServiceArn() == null)
            return false;
        if (other.getServiceArn() != null && other.getServiceArn().equals(this.getServiceArn()) == false)
            return false;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        if (other.getClusterArn() == null ^ this.getClusterArn() == null)
            return false;
        if (other.getClusterArn() != null && other.getClusterArn().equals(this.getClusterArn()) == false)
            return false;
        if (other.getLoadBalancers() == null ^ this.getLoadBalancers() == null)
            return false;
        if (other.getLoadBalancers() != null && other.getLoadBalancers().equals(this.getLoadBalancers()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDesiredCount() == null ^ this.getDesiredCount() == null)
            return false;
        if (other.getDesiredCount() != null && other.getDesiredCount().equals(this.getDesiredCount()) == false)
            return false;
        if (other.getRunningCount() == null ^ this.getRunningCount() == null)
            return false;
        if (other.getRunningCount() != null && other.getRunningCount().equals(this.getRunningCount()) == false)
            return false;
        if (other.getPendingCount() == null ^ this.getPendingCount() == null)
            return false;
        if (other.getPendingCount() != null && other.getPendingCount().equals(this.getPendingCount()) == false)
            return false;
        if (other.getLaunchType() == null ^ this.getLaunchType() == null)
            return false;
        if (other.getLaunchType() != null && other.getLaunchType().equals(this.getLaunchType()) == false)
            return false;
        if (other.getPlatformVersion() == null ^ this.getPlatformVersion() == null)
            return false;
        if (other.getPlatformVersion() != null && other.getPlatformVersion().equals(this.getPlatformVersion()) == false)
            return false;
        if (other.getTaskDefinition() == null ^ this.getTaskDefinition() == null)
            return false;
        if (other.getTaskDefinition() != null && other.getTaskDefinition().equals(this.getTaskDefinition()) == false)
            return false;
        if (other.getDeploymentConfiguration() == null ^ this.getDeploymentConfiguration() == null)
            return false;
        if (other.getDeploymentConfiguration() != null && other.getDeploymentConfiguration().equals(this.getDeploymentConfiguration()) == false)
            return false;
        if (other.getDeployments() == null ^ this.getDeployments() == null)
            return false;
        if (other.getDeployments() != null && other.getDeployments().equals(this.getDeployments()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getEvents() == null ^ this.getEvents() == null)
            return false;
        if (other.getEvents() != null && other.getEvents().equals(this.getEvents()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getPlacementConstraints() == null ^ this.getPlacementConstraints() == null)
            return false;
        if (other.getPlacementConstraints() != null && other.getPlacementConstraints().equals(this.getPlacementConstraints()) == false)
            return false;
        if (other.getPlacementStrategy() == null ^ this.getPlacementStrategy() == null)
            return false;
        if (other.getPlacementStrategy() != null && other.getPlacementStrategy().equals(this.getPlacementStrategy()) == false)
            return false;
        if (other.getNetworkConfiguration() == null ^ this.getNetworkConfiguration() == null)
            return false;
        if (other.getNetworkConfiguration() != null && other.getNetworkConfiguration().equals(this.getNetworkConfiguration()) == false)
            return false;
        if (other.getHealthCheckGracePeriodSeconds() == null ^ this.getHealthCheckGracePeriodSeconds() == null)
            return false;
        if (other.getHealthCheckGracePeriodSeconds() != null
                && other.getHealthCheckGracePeriodSeconds().equals(this.getHealthCheckGracePeriodSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceArn() == null) ? 0 : getServiceArn().hashCode());
        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode + ((getClusterArn() == null) ? 0 : getClusterArn().hashCode());
        hashCode = prime * hashCode + ((getLoadBalancers() == null) ? 0 : getLoadBalancers().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getDesiredCount() == null) ? 0 : getDesiredCount().hashCode());
        hashCode = prime * hashCode + ((getRunningCount() == null) ? 0 : getRunningCount().hashCode());
        hashCode = prime * hashCode + ((getPendingCount() == null) ? 0 : getPendingCount().hashCode());
        hashCode = prime * hashCode + ((getLaunchType() == null) ? 0 : getLaunchType().hashCode());
        hashCode = prime * hashCode + ((getPlatformVersion() == null) ? 0 : getPlatformVersion().hashCode());
        hashCode = prime * hashCode + ((getTaskDefinition() == null) ? 0 : getTaskDefinition().hashCode());
        hashCode = prime * hashCode + ((getDeploymentConfiguration() == null) ? 0 : getDeploymentConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDeployments() == null) ? 0 : getDeployments().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getEvents() == null) ? 0 : getEvents().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getPlacementConstraints() == null) ? 0 : getPlacementConstraints().hashCode());
        hashCode = prime * hashCode + ((getPlacementStrategy() == null) ? 0 : getPlacementStrategy().hashCode());
        hashCode = prime * hashCode + ((getNetworkConfiguration() == null) ? 0 : getNetworkConfiguration().hashCode());
        hashCode = prime * hashCode + ((getHealthCheckGracePeriodSeconds() == null) ? 0 : getHealthCheckGracePeriodSeconds().hashCode());
        return hashCode;
    }

    @Override
    public Service clone() {
        try {
            return (Service) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.ServiceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
