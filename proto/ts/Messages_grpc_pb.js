// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('@grpc/grpc-js');
var Messages_pb = require('./Messages_pb.js');

function serialize_org_mosim_refactorlizar_messages_ArchitectureEvaluationRequest(arg) {
  if (!(arg instanceof Messages_pb.ArchitectureEvaluationRequest)) {
    throw new Error('Expected argument of type org.mosim.refactorlizar.messages.ArchitectureEvaluationRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_org_mosim_refactorlizar_messages_ArchitectureEvaluationRequest(buffer_arg) {
  return Messages_pb.ArchitectureEvaluationRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_org_mosim_refactorlizar_messages_ArchitectureEvaluationResponse(arg) {
  if (!(arg instanceof Messages_pb.ArchitectureEvaluationResponse)) {
    throw new Error('Expected argument of type org.mosim.refactorlizar.messages.ArchitectureEvaluationResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_org_mosim_refactorlizar_messages_ArchitectureEvaluationResponse(buffer_arg) {
  return Messages_pb.ArchitectureEvaluationResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var ArchitectureEvaluationService = exports.ArchitectureEvaluationService = {
  evaluateMetric: {
    path: '/org.mosim.refactorlizar.messages.ArchitectureEvaluation/EvaluateMetric',
    requestStream: false,
    responseStream: false,
    requestType: Messages_pb.ArchitectureEvaluationRequest,
    responseType: Messages_pb.ArchitectureEvaluationResponse,
    requestSerialize: serialize_org_mosim_refactorlizar_messages_ArchitectureEvaluationRequest,
    requestDeserialize: deserialize_org_mosim_refactorlizar_messages_ArchitectureEvaluationRequest,
    responseSerialize: serialize_org_mosim_refactorlizar_messages_ArchitectureEvaluationResponse,
    responseDeserialize: deserialize_org_mosim_refactorlizar_messages_ArchitectureEvaluationResponse,
  },
};

exports.ArchitectureEvaluationClient = grpc.makeGenericClientConstructor(ArchitectureEvaluationService);
