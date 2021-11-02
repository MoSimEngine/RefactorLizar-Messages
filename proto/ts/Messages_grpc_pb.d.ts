// GENERATED CODE -- DO NOT EDIT!

// package: org.mosim.refactorlizar.messages
// file: Messages.proto

import * as Messages_pb from "./Messages_pb";
import * as grpc from "@grpc/grpc-js";

interface IArchitectureEvaluationService extends grpc.ServiceDefinition<grpc.UntypedServiceImplementation> {
  evaluateMetric: grpc.MethodDefinition<Messages_pb.ArchitectureEvaluationRequest, Messages_pb.ArchitectureEvaluationResponse>;
}

export const ArchitectureEvaluationService: IArchitectureEvaluationService;

export interface IArchitectureEvaluationServer extends grpc.UntypedServiceImplementation {
  evaluateMetric: grpc.handleUnaryCall<Messages_pb.ArchitectureEvaluationRequest, Messages_pb.ArchitectureEvaluationResponse>;
}

export class ArchitectureEvaluationClient extends grpc.Client {
  constructor(address: string, credentials: grpc.ChannelCredentials, options?: object);
  evaluateMetric(argument: Messages_pb.ArchitectureEvaluationRequest, callback: grpc.requestCallback<Messages_pb.ArchitectureEvaluationResponse>): grpc.ClientUnaryCall;
  evaluateMetric(argument: Messages_pb.ArchitectureEvaluationRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<Messages_pb.ArchitectureEvaluationResponse>): grpc.ClientUnaryCall;
  evaluateMetric(argument: Messages_pb.ArchitectureEvaluationRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<Messages_pb.ArchitectureEvaluationResponse>): grpc.ClientUnaryCall;
}
