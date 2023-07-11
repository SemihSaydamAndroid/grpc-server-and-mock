import io.grpc.Server;
import io.grpc.ServerBuilder;
import user.UserService;

import java.io.IOException;

public class GrpcClient {

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Starting gRPC server...");
        //User service olarak yazdığın service'i 9090'dan server olarak aç :
        Server server = ServerBuilder.forPort(9090).addService(new UserService()).build();
        server.getServices();
        server.start();
        System.out.println("Server starter at " + server.getPort() + " Port");
        server.awaitTermination();
    }
}
