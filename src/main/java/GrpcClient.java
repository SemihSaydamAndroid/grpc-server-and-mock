import io.grpc.Server;
import io.grpc.ServerBuilder;
import user.userService;

import java.io.IOException;
import java.io.InterruptedIOException;

public class GrpcClient {

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Starting gRPC server...");
        //User service olarak yazdığın service'i 9090'dan server olarak aç :
        Server server = ServerBuilder.forPort(9090).addService(new userService()).build();
        server.getServices();
        server.start();
        System.out.println("Server starter at " + server.getPort() + " Port");
        server.awaitTermination();
    }
}
