//import io.grpc.ManagedChannel;
//import io.grpc.ManagedChannelBuilder;
//import io.grpc.stub.StreamObserver;
//import org.example.User;
//import org.grpcmock.GrpcMock;
//import org.grpcmock.junit5.GrpcMockExtension;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.grpcmock.GrpcMock.*;
//
//import org.example.userGrpc;
//import user.UserService;
//
//@ExtendWith(GrpcMockExtension.class)
//public class UserServiceTest {
//
//    private ManagedChannel channel;
//    private UserService userService;
//
//    @BeforeEach
//    void setup() {
//        channel = ManagedChannelBuilder.forAddress("localhost", GrpcMock.getGlobalPort())
//                .usePlaintext()
//                .build();
//        userService = new UserService();
//    }
//
////User.APIResponse apiResponse = userGrpc.userBlockingStub.newStub()
//
//    @Test
//    void should_return_success(){
//        String username = "Semih";
//        String password = "123zxc";
//        User.APIResponse.Builder response = User.APIResponse.newBuilder()
//                .setResponseCode(0).set;
//
//        String responseMessage = "SUCCESS";
//        int responseCode = 0;
//
//        User.loginRequest buildRequest = User.loginRequest.newBuilder()
//                .setUsername(username).setPassword(password)
//                .build();
//
//
//        stubFor(unaryMethod(userGrpc.getLoginMethod())
//                .willReturn(
//                        User.APIResponse.newBuilder()
//                        .setResponseCode(responseCode).setResponsemessega(responseMessage)
//                        .build()));
//
//
//
//
//
//
//        verifyThat(calledMethod(userGrpc.getLoginMethod()).withRequest(buildRequest));
//    }
//
//}
