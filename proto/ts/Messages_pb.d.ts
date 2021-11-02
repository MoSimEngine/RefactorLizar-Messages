// package: org.mosim.refactorlizar.messages
// file: Messages.proto

import * as jspb from "google-protobuf";

export class ArchitectureEvaluationRequest extends jspb.Message {
  hasProject(): boolean;
  clearProject(): void;
  getProject(): Project | undefined;
  setProject(value?: Project): void;

  getOffset(): OffsetMap[keyof OffsetMap];
  setOffset(value: OffsetMap[keyof OffsetMap]): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ArchitectureEvaluationRequest.AsObject;
  static toObject(includeInstance: boolean, msg: ArchitectureEvaluationRequest): ArchitectureEvaluationRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: ArchitectureEvaluationRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ArchitectureEvaluationRequest;
  static deserializeBinaryFromReader(message: ArchitectureEvaluationRequest, reader: jspb.BinaryReader): ArchitectureEvaluationRequest;
}

export namespace ArchitectureEvaluationRequest {
  export type AsObject = {
    project?: Project.AsObject,
    offset: OffsetMap[keyof OffsetMap],
  }
}

export class ArchitectureEvaluationResponse extends jspb.Message {
  hasError(): boolean;
  clearError(): void;
  getError(): Error | undefined;
  setError(value?: Error): void;

  hasMetrics(): boolean;
  clearMetrics(): void;
  getMetrics(): Metric | undefined;
  setMetrics(value?: Metric): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ArchitectureEvaluationResponse.AsObject;
  static toObject(includeInstance: boolean, msg: ArchitectureEvaluationResponse): ArchitectureEvaluationResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: ArchitectureEvaluationResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ArchitectureEvaluationResponse;
  static deserializeBinaryFromReader(message: ArchitectureEvaluationResponse, reader: jspb.BinaryReader): ArchitectureEvaluationResponse;
}

export namespace ArchitectureEvaluationResponse {
  export type AsObject = {
    error?: Error.AsObject,
    metrics?: Metric.AsObject,
  }
}

export class Error extends jspb.Message {
  getMessage(): string;
  setMessage(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Error.AsObject;
  static toObject(includeInstance: boolean, msg: Error): Error.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: Error, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Error;
  static deserializeBinaryFromReader(message: Error, reader: jspb.BinaryReader): Error;
}

export namespace Error {
  export type AsObject = {
    message: string,
  }
}

export class Metric extends jspb.Message {
  getCohesion(): number;
  setCohesion(value: number): void;

  getComplexity(): number;
  setComplexity(value: number): void;

  getCoupling(): number;
  setCoupling(value: number): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Metric.AsObject;
  static toObject(includeInstance: boolean, msg: Metric): Metric.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: Metric, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Metric;
  static deserializeBinaryFromReader(message: Metric, reader: jspb.BinaryReader): Metric;
}

export namespace Metric {
  export type AsObject = {
    cohesion: number,
    complexity: number,
    coupling: number,
  }
}

export class Project extends jspb.Message {
  clearLanguagePathsList(): void;
  getLanguagePathsList(): Array<string>;
  setLanguagePathsList(value: Array<string>): void;
  addLanguagePaths(value: string, index?: number): string;

  clearSimulatorPathsList(): void;
  getSimulatorPathsList(): Array<string>;
  setSimulatorPathsList(value: Array<string>): void;
  addSimulatorPaths(value: string, index?: number): string;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Project.AsObject;
  static toObject(includeInstance: boolean, msg: Project): Project.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: Project, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Project;
  static deserializeBinaryFromReader(message: Project, reader: jspb.BinaryReader): Project;
}

export namespace Project {
  export type AsObject = {
    languagePathsList: Array<string>,
    simulatorPathsList: Array<string>,
  }
}

export interface OffsetMap {
  NO_OFFSET: 0;
  ONE_OFFSET: 1;
}

export const Offset: OffsetMap;

