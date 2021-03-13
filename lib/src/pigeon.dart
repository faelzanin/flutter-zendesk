// Autogenerated from Pigeon (v0.1.22), do not edit directly.
// See also: https://pub.dev/packages/pigeon
// ignore_for_file: public_member_api_docs, non_constant_identifier_names, avoid_as, unused_import
// @dart = 2.8
import 'dart:async';
import 'dart:typed_data' show Uint8List, Int32List, Int64List, Float64List;

import 'package:flutter/services.dart';

class InitializeRequest {
  String accountKey;
  String appId;

  Object encode() {
    final Map<Object, Object> pigeonMap = <Object, Object>{};
    pigeonMap['accountKey'] = accountKey;
    pigeonMap['appId'] = appId;
    return pigeonMap;
  }

  static InitializeRequest decode(Object message) {
    final Map<Object, Object> pigeonMap = message as Map<Object, Object>;
    return InitializeRequest()
      ..accountKey = pigeonMap['accountKey'] as String
      ..appId = pigeonMap['appId'] as String;
  }
}

class SetDepartmentRequest {
  String department;

  Object encode() {
    final Map<Object, Object> pigeonMap = <Object, Object>{};
    pigeonMap['department'] = department;
    return pigeonMap;
  }

  static SetDepartmentRequest decode(Object message) {
    final Map<Object, Object> pigeonMap = message as Map<Object, Object>;
    return SetDepartmentRequest()
      ..department = pigeonMap['department'] as String;
  }
}

class StartChatRequest {
  bool isPreChatFormEnabled;
  bool isOfflineFormEnabled;
  bool isAgentAvailabilityEnabled;
  bool isChatTranscriptPromptEnabled;
  String messagingName;
  String iosBackButtonTitle;
  int iosNavigationBarColor;
  int iosNavigationTitleColor;

  Object encode() {
    final Map<Object, Object> pigeonMap = <Object, Object>{};
    pigeonMap['isPreChatFormEnabled'] = isPreChatFormEnabled;
    pigeonMap['isOfflineFormEnabled'] = isOfflineFormEnabled;
    pigeonMap['isAgentAvailabilityEnabled'] = isAgentAvailabilityEnabled;
    pigeonMap['isChatTranscriptPromptEnabled'] = isChatTranscriptPromptEnabled;
    pigeonMap['messagingName'] = messagingName;
    pigeonMap['iosBackButtonTitle'] = iosBackButtonTitle;
    pigeonMap['iosNavigationBarColor'] = iosNavigationBarColor;
    pigeonMap['iosNavigationTitleColor'] = iosNavigationTitleColor;
    return pigeonMap;
  }

  static StartChatRequest decode(Object message) {
    final Map<Object, Object> pigeonMap = message as Map<Object, Object>;
    return StartChatRequest()
      ..isPreChatFormEnabled = pigeonMap['isPreChatFormEnabled'] as bool
      ..isOfflineFormEnabled = pigeonMap['isOfflineFormEnabled'] as bool
      ..isAgentAvailabilityEnabled = pigeonMap['isAgentAvailabilityEnabled'] as bool
      ..isChatTranscriptPromptEnabled = pigeonMap['isChatTranscriptPromptEnabled'] as bool
      ..messagingName = pigeonMap['messagingName'] as String
      ..iosBackButtonTitle = pigeonMap['iosBackButtonTitle'] as String
      ..iosNavigationBarColor = pigeonMap['iosNavigationBarColor'] as int
      ..iosNavigationTitleColor = pigeonMap['iosNavigationTitleColor'] as int;
  }
}

class SetVisitorInfoRequest {
  String visitorName;
  String visitorEmail;
  String visitorPhone;

  Object encode() {
    final Map<Object, Object> pigeonMap = <Object, Object>{};
    pigeonMap['visitorName'] = visitorName;
    pigeonMap['visitorEmail'] = visitorEmail;
    pigeonMap['visitorPhone'] = visitorPhone;
    return pigeonMap;
  }

  static SetVisitorInfoRequest decode(Object message) {
    final Map<Object, Object> pigeonMap = message as Map<Object, Object>;
    return SetVisitorInfoRequest()
      ..visitorName = pigeonMap['visitorName'] as String
      ..visitorEmail = pigeonMap['visitorEmail'] as String
      ..visitorPhone = pigeonMap['visitorPhone'] as String;
  }
}

class VisitorTagsRequest {
  List<Object> tags;

  Object encode() {
    final Map<Object, Object> pigeonMap = <Object, Object>{};
    pigeonMap['tags'] = tags;
    return pigeonMap;
  }

  static VisitorTagsRequest decode(Object message) {
    final Map<Object, Object> pigeonMap = message as Map<Object, Object>;
    return VisitorTagsRequest()
      ..tags = pigeonMap['tags'] as List<Object>;
  }
}

class VisitorNoteRequest {
  String note;

  Object encode() {
    final Map<Object, Object> pigeonMap = <Object, Object>{};
    pigeonMap['note'] = note;
    return pigeonMap;
  }

  static VisitorNoteRequest decode(Object message) {
    final Map<Object, Object> pigeonMap = message as Map<Object, Object>;
    return VisitorNoteRequest()
      ..note = pigeonMap['note'] as String;
  }
}

class ChatApi {
  Future<void> initialize(InitializeRequest arg) async {
    final Object encoded = arg.encode();
    const BasicMessageChannel<Object> channel =
        BasicMessageChannel<Object>('dev.flutter.pigeon.ChatApi.initialize', StandardMessageCodec());
    final Map<Object, Object> replyMap = await channel.send(encoded) as Map<Object, Object>;
    if (replyMap == null) {
      throw PlatformException(
        code: 'channel-error',
        message: 'Unable to establish connection on channel.',
        details: null,
      );
    } else if (replyMap['error'] != null) {
      final Map<Object, Object> error = replyMap['error'] as Map<Object, Object>;
      throw PlatformException(
        code: error['code'] as String,
        message: error['message'] as String,
        details: error['details'],
      );
    } else {
      // noop
    }
  }

  Future<void> setDepartment(SetDepartmentRequest arg) async {
    final Object encoded = arg.encode();
    const BasicMessageChannel<Object> channel =
        BasicMessageChannel<Object>('dev.flutter.pigeon.ChatApi.setDepartment', StandardMessageCodec());
    final Map<Object, Object> replyMap = await channel.send(encoded) as Map<Object, Object>;
    if (replyMap == null) {
      throw PlatformException(
        code: 'channel-error',
        message: 'Unable to establish connection on channel.',
        details: null,
      );
    } else if (replyMap['error'] != null) {
      final Map<Object, Object> error = replyMap['error'] as Map<Object, Object>;
      throw PlatformException(
        code: error['code'] as String,
        message: error['message'] as String,
        details: error['details'],
      );
    } else {
      // noop
    }
  }

  Future<void> startChat(StartChatRequest arg) async {
    final Object encoded = arg.encode();
    const BasicMessageChannel<Object> channel =
        BasicMessageChannel<Object>('dev.flutter.pigeon.ChatApi.startChat', StandardMessageCodec());
    final Map<Object, Object> replyMap = await channel.send(encoded) as Map<Object, Object>;
    if (replyMap == null) {
      throw PlatformException(
        code: 'channel-error',
        message: 'Unable to establish connection on channel.',
        details: null,
      );
    } else if (replyMap['error'] != null) {
      final Map<Object, Object> error = replyMap['error'] as Map<Object, Object>;
      throw PlatformException(
        code: error['code'] as String,
        message: error['message'] as String,
        details: error['details'],
      );
    } else {
      // noop
    }
  }
}

class ProfileApi {
  Future<void> setVisitorInfo(SetVisitorInfoRequest arg) async {
    final Object encoded = arg.encode();
    const BasicMessageChannel<Object> channel =
        BasicMessageChannel<Object>('dev.flutter.pigeon.ProfileApi.setVisitorInfo', StandardMessageCodec());
    final Map<Object, Object> replyMap = await channel.send(encoded) as Map<Object, Object>;
    if (replyMap == null) {
      throw PlatformException(
        code: 'channel-error',
        message: 'Unable to establish connection on channel.',
        details: null,
      );
    } else if (replyMap['error'] != null) {
      final Map<Object, Object> error = replyMap['error'] as Map<Object, Object>;
      throw PlatformException(
        code: error['code'] as String,
        message: error['message'] as String,
        details: error['details'],
      );
    } else {
      // noop
    }
  }

  Future<void> addVisitorTags(VisitorTagsRequest arg) async {
    final Object encoded = arg.encode();
    const BasicMessageChannel<Object> channel =
        BasicMessageChannel<Object>('dev.flutter.pigeon.ProfileApi.addVisitorTags', StandardMessageCodec());
    final Map<Object, Object> replyMap = await channel.send(encoded) as Map<Object, Object>;
    if (replyMap == null) {
      throw PlatformException(
        code: 'channel-error',
        message: 'Unable to establish connection on channel.',
        details: null,
      );
    } else if (replyMap['error'] != null) {
      final Map<Object, Object> error = replyMap['error'] as Map<Object, Object>;
      throw PlatformException(
        code: error['code'] as String,
        message: error['message'] as String,
        details: error['details'],
      );
    } else {
      // noop
    }
  }

  Future<void> removeVisitorTags(VisitorTagsRequest arg) async {
    final Object encoded = arg.encode();
    const BasicMessageChannel<Object> channel =
        BasicMessageChannel<Object>('dev.flutter.pigeon.ProfileApi.removeVisitorTags', StandardMessageCodec());
    final Map<Object, Object> replyMap = await channel.send(encoded) as Map<Object, Object>;
    if (replyMap == null) {
      throw PlatformException(
        code: 'channel-error',
        message: 'Unable to establish connection on channel.',
        details: null,
      );
    } else if (replyMap['error'] != null) {
      final Map<Object, Object> error = replyMap['error'] as Map<Object, Object>;
      throw PlatformException(
        code: error['code'] as String,
        message: error['message'] as String,
        details: error['details'],
      );
    } else {
      // noop
    }
  }

  Future<void> setVisitorNote(VisitorNoteRequest arg) async {
    final Object encoded = arg.encode();
    const BasicMessageChannel<Object> channel =
        BasicMessageChannel<Object>('dev.flutter.pigeon.ProfileApi.setVisitorNote', StandardMessageCodec());
    final Map<Object, Object> replyMap = await channel.send(encoded) as Map<Object, Object>;
    if (replyMap == null) {
      throw PlatformException(
        code: 'channel-error',
        message: 'Unable to establish connection on channel.',
        details: null,
      );
    } else if (replyMap['error'] != null) {
      final Map<Object, Object> error = replyMap['error'] as Map<Object, Object>;
      throw PlatformException(
        code: error['code'] as String,
        message: error['message'] as String,
        details: error['details'],
      );
    } else {
      // noop
    }
  }

  Future<void> appendVisitorNote(VisitorNoteRequest arg) async {
    final Object encoded = arg.encode();
    const BasicMessageChannel<Object> channel =
        BasicMessageChannel<Object>('dev.flutter.pigeon.ProfileApi.appendVisitorNote', StandardMessageCodec());
    final Map<Object, Object> replyMap = await channel.send(encoded) as Map<Object, Object>;
    if (replyMap == null) {
      throw PlatformException(
        code: 'channel-error',
        message: 'Unable to establish connection on channel.',
        details: null,
      );
    } else if (replyMap['error'] != null) {
      final Map<Object, Object> error = replyMap['error'] as Map<Object, Object>;
      throw PlatformException(
        code: error['code'] as String,
        message: error['message'] as String,
        details: error['details'],
      );
    } else {
      // noop
    }
  }

  Future<void> clearVisitorNotes() async {
    const BasicMessageChannel<Object> channel =
        BasicMessageChannel<Object>('dev.flutter.pigeon.ProfileApi.clearVisitorNotes', StandardMessageCodec());
    final Map<Object, Object> replyMap = await channel.send(null) as Map<Object, Object>;
    if (replyMap == null) {
      throw PlatformException(
        code: 'channel-error',
        message: 'Unable to establish connection on channel.',
        details: null,
      );
    } else if (replyMap['error'] != null) {
      final Map<Object, Object> error = replyMap['error'] as Map<Object, Object>;
      throw PlatformException(
        code: error['code'] as String,
        message: error['message'] as String,
        details: error['details'],
      );
    } else {
      // noop
    }
  }
}
