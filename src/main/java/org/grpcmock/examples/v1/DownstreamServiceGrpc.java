package org.grpcmock.examples.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: downstream_service.proto")
public final class DownstreamServiceGrpc {

  private DownstreamServiceGrpc() {}

  public static final String SERVICE_NAME = "grpcmock.examples.v1.DownstreamService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.grpcmock.examples.v1.GetDownstreamMessageRequest,
      org.grpcmock.examples.v1.GetDownstreamMessageResponse> getGetDownstreamMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDownstreamMessage",
      requestType = org.grpcmock.examples.v1.GetDownstreamMessageRequest.class,
      responseType = org.grpcmock.examples.v1.GetDownstreamMessageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.grpcmock.examples.v1.GetDownstreamMessageRequest,
      org.grpcmock.examples.v1.GetDownstreamMessageResponse> getGetDownstreamMessageMethod() {
    io.grpc.MethodDescriptor<org.grpcmock.examples.v1.GetDownstreamMessageRequest, org.grpcmock.examples.v1.GetDownstreamMessageResponse> getGetDownstreamMessageMethod;
    if ((getGetDownstreamMessageMethod = DownstreamServiceGrpc.getGetDownstreamMessageMethod) == null) {
      synchronized (DownstreamServiceGrpc.class) {
        if ((getGetDownstreamMessageMethod = DownstreamServiceGrpc.getGetDownstreamMessageMethod) == null) {
          DownstreamServiceGrpc.getGetDownstreamMessageMethod = getGetDownstreamMessageMethod = 
              io.grpc.MethodDescriptor.<org.grpcmock.examples.v1.GetDownstreamMessageRequest, org.grpcmock.examples.v1.GetDownstreamMessageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpcmock.examples.v1.DownstreamService", "GetDownstreamMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.grpcmock.examples.v1.GetDownstreamMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.grpcmock.examples.v1.GetDownstreamMessageResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DownstreamServiceMethodDescriptorSupplier("GetDownstreamMessage"))
                  .build();
          }
        }
     }
     return getGetDownstreamMessageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DownstreamServiceStub newStub(io.grpc.Channel channel) {
    return new DownstreamServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DownstreamServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DownstreamServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DownstreamServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DownstreamServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class DownstreamServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getDownstreamMessage(org.grpcmock.examples.v1.GetDownstreamMessageRequest request,
        io.grpc.stub.StreamObserver<org.grpcmock.examples.v1.GetDownstreamMessageResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDownstreamMessageMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetDownstreamMessageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.grpcmock.examples.v1.GetDownstreamMessageRequest,
                org.grpcmock.examples.v1.GetDownstreamMessageResponse>(
                  this, METHODID_GET_DOWNSTREAM_MESSAGE)))
          .build();
    }
  }

  /**
   */
  public static final class DownstreamServiceStub extends io.grpc.stub.AbstractStub<DownstreamServiceStub> {
    private DownstreamServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DownstreamServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DownstreamServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DownstreamServiceStub(channel, callOptions);
    }

    /**
     */
    public void getDownstreamMessage(org.grpcmock.examples.v1.GetDownstreamMessageRequest request,
        io.grpc.stub.StreamObserver<org.grpcmock.examples.v1.GetDownstreamMessageResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDownstreamMessageMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DownstreamServiceBlockingStub extends io.grpc.stub.AbstractStub<DownstreamServiceBlockingStub> {
    private DownstreamServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DownstreamServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DownstreamServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DownstreamServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.grpcmock.examples.v1.GetDownstreamMessageResponse getDownstreamMessage(org.grpcmock.examples.v1.GetDownstreamMessageRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetDownstreamMessageMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DownstreamServiceFutureStub extends io.grpc.stub.AbstractStub<DownstreamServiceFutureStub> {
    private DownstreamServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DownstreamServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DownstreamServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DownstreamServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.grpcmock.examples.v1.GetDownstreamMessageResponse> getDownstreamMessage(
        org.grpcmock.examples.v1.GetDownstreamMessageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDownstreamMessageMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_DOWNSTREAM_MESSAGE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DownstreamServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DownstreamServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_DOWNSTREAM_MESSAGE:
          serviceImpl.getDownstreamMessage((org.grpcmock.examples.v1.GetDownstreamMessageRequest) request,
              (io.grpc.stub.StreamObserver<org.grpcmock.examples.v1.GetDownstreamMessageResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class DownstreamServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DownstreamServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.grpcmock.examples.v1.DownstreamServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DownstreamService");
    }
  }

  private static final class DownstreamServiceFileDescriptorSupplier
      extends DownstreamServiceBaseDescriptorSupplier {
    DownstreamServiceFileDescriptorSupplier() {}
  }

  private static final class DownstreamServiceMethodDescriptorSupplier
      extends DownstreamServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DownstreamServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DownstreamServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DownstreamServiceFileDescriptorSupplier())
              .addMethod(getGetDownstreamMessageMethod())
              .build();
        }
      }
    }
    return result;
  }
}
