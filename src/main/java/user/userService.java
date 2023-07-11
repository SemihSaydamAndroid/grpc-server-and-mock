package user;

import io.grpc.stub.StreamObserver;
import org.example.User;
import org.example.userGrpc.userImplBase;

public class userService extends userImplBase {
    @Override
    public void login(User.loginRequest request, StreamObserver<User.APIResponse> responseObserver) {
        System.out.println("Inside login method...");

        String username = request.getUsername();
        String password = request.getPassword();

        User.APIResponse.Builder response = User.APIResponse.newBuilder();
        if (username.equals(password)){
            System.out.println("Success Request encountered");
            response.setResponseCode(0).setResponsemessega("SUCCESS");
        }else {
            System.out.println("Failure Request encountered");
            response.setResponseCode(100).setResponsemessega("Invalid Password");
        }

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void logout(User.Empty request, StreamObserver<User.APIResponse> responseObserver) {
    }
}
