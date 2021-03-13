
package com.codeheadlabs.zendesk.pigeon;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.StandardMessageCodec;
import java.util.ArrayList;
import java.util.HashMap;

/** Generated class from Pigeon. */
@SuppressWarnings("unused")
public class ZendeskPigeon {

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class InitializeRequest {
    private String accountKey;
    public String getAccountKey() { return accountKey; }
    public void setAccountKey(String setterArg) { this.accountKey = setterArg; }

    private String appId;
    public String getAppId() { return appId; }
    public void setAppId(String setterArg) { this.appId = setterArg; }

    HashMap toMap() {
      HashMap<String, Object> toMapResult = new HashMap<>();
      toMapResult.put("accountKey", accountKey);
      toMapResult.put("appId", appId);
      return toMapResult;
    }
    static InitializeRequest fromMap(HashMap map) {
      InitializeRequest fromMapResult = new InitializeRequest();
      Object accountKey = map.get("accountKey");
      fromMapResult.accountKey = (String)accountKey;
      Object appId = map.get("appId");
      fromMapResult.appId = (String)appId;
      return fromMapResult;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class SetDepartmentRequest {
    private String department;
    public String getDepartment() { return department; }
    public void setDepartment(String setterArg) { this.department = setterArg; }

    HashMap toMap() {
      HashMap<String, Object> toMapResult = new HashMap<>();
      toMapResult.put("department", department);
      return toMapResult;
    }
    static SetDepartmentRequest fromMap(HashMap map) {
      SetDepartmentRequest fromMapResult = new SetDepartmentRequest();
      Object department = map.get("department");
      fromMapResult.department = (String)department;
      return fromMapResult;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class StartChatRequest {
    private Boolean isPreChatFormEnabled;
    public Boolean getIsPreChatFormEnabled() { return isPreChatFormEnabled; }
    public void setIsPreChatFormEnabled(Boolean setterArg) { this.isPreChatFormEnabled = setterArg; }

    private Boolean isOfflineFormEnabled;
    public Boolean getIsOfflineFormEnabled() { return isOfflineFormEnabled; }
    public void setIsOfflineFormEnabled(Boolean setterArg) { this.isOfflineFormEnabled = setterArg; }

    private Boolean isAgentAvailabilityEnabled;
    public Boolean getIsAgentAvailabilityEnabled() { return isAgentAvailabilityEnabled; }
    public void setIsAgentAvailabilityEnabled(Boolean setterArg) { this.isAgentAvailabilityEnabled = setterArg; }

    private Boolean isChatTranscriptPromptEnabled;
    public Boolean getIsChatTranscriptPromptEnabled() { return isChatTranscriptPromptEnabled; }
    public void setIsChatTranscriptPromptEnabled(Boolean setterArg) { this.isChatTranscriptPromptEnabled = setterArg; }

    private String messagingName;
    public String getMessagingName() { return messagingName; }
    public void setMessagingName(String setterArg) { this.messagingName = setterArg; }

    private String iosBackButtonTitle;
    public String getIosBackButtonTitle() { return iosBackButtonTitle; }
    public void setIosBackButtonTitle(String setterArg) { this.iosBackButtonTitle = setterArg; }

    private Long iosNavigationBarColor;
    public Long getIosNavigationBarColor() { return iosNavigationBarColor; }
    public void setIosNavigationBarColor(Long setterArg) { this.iosNavigationBarColor = setterArg; }

    private Long iosNavigationTitleColor;
    public Long getIosNavigationTitleColor() { return iosNavigationTitleColor; }
    public void setIosNavigationTitleColor(Long setterArg) { this.iosNavigationTitleColor = setterArg; }

    HashMap toMap() {
      HashMap<String, Object> toMapResult = new HashMap<>();
      toMapResult.put("isPreChatFormEnabled", isPreChatFormEnabled);
      toMapResult.put("isOfflineFormEnabled", isOfflineFormEnabled);
      toMapResult.put("isAgentAvailabilityEnabled", isAgentAvailabilityEnabled);
      toMapResult.put("isChatTranscriptPromptEnabled", isChatTranscriptPromptEnabled);
      toMapResult.put("messagingName", messagingName);
      toMapResult.put("iosBackButtonTitle", iosBackButtonTitle);
      toMapResult.put("iosNavigationBarColor", iosNavigationBarColor);
      toMapResult.put("iosNavigationTitleColor", iosNavigationTitleColor);
      return toMapResult;
    }
    static StartChatRequest fromMap(HashMap map) {
      StartChatRequest fromMapResult = new StartChatRequest();
      Object isPreChatFormEnabled = map.get("isPreChatFormEnabled");
      fromMapResult.isPreChatFormEnabled = (Boolean)isPreChatFormEnabled;
      Object isOfflineFormEnabled = map.get("isOfflineFormEnabled");
      fromMapResult.isOfflineFormEnabled = (Boolean)isOfflineFormEnabled;
      Object isAgentAvailabilityEnabled = map.get("isAgentAvailabilityEnabled");
      fromMapResult.isAgentAvailabilityEnabled = (Boolean)isAgentAvailabilityEnabled;
      Object isChatTranscriptPromptEnabled = map.get("isChatTranscriptPromptEnabled");
      fromMapResult.isChatTranscriptPromptEnabled = (Boolean)isChatTranscriptPromptEnabled;
      Object messagingName = map.get("messagingName");
      fromMapResult.messagingName = (String)messagingName;
      Object iosBackButtonTitle = map.get("iosBackButtonTitle");
      fromMapResult.iosBackButtonTitle = (String)iosBackButtonTitle;
      Object iosNavigationBarColor = map.get("iosNavigationBarColor");
      fromMapResult.iosNavigationBarColor = (iosNavigationBarColor == null) ? null : ((iosNavigationBarColor instanceof Integer) ? (Integer)iosNavigationBarColor : (Long)iosNavigationBarColor);
      Object iosNavigationTitleColor = map.get("iosNavigationTitleColor");
      fromMapResult.iosNavigationTitleColor = (iosNavigationTitleColor == null) ? null : ((iosNavigationTitleColor instanceof Integer) ? (Integer)iosNavigationTitleColor : (Long)iosNavigationTitleColor);
      return fromMapResult;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class SetVisitorInfoRequest {
    private String visitorName;
    public String getVisitorName() { return visitorName; }
    public void setVisitorName(String setterArg) { this.visitorName = setterArg; }

    private String visitorEmail;
    public String getVisitorEmail() { return visitorEmail; }
    public void setVisitorEmail(String setterArg) { this.visitorEmail = setterArg; }

    private String visitorPhone;
    public String getVisitorPhone() { return visitorPhone; }
    public void setVisitorPhone(String setterArg) { this.visitorPhone = setterArg; }

    HashMap toMap() {
      HashMap<String, Object> toMapResult = new HashMap<>();
      toMapResult.put("visitorName", visitorName);
      toMapResult.put("visitorEmail", visitorEmail);
      toMapResult.put("visitorPhone", visitorPhone);
      return toMapResult;
    }
    static SetVisitorInfoRequest fromMap(HashMap map) {
      SetVisitorInfoRequest fromMapResult = new SetVisitorInfoRequest();
      Object visitorName = map.get("visitorName");
      fromMapResult.visitorName = (String)visitorName;
      Object visitorEmail = map.get("visitorEmail");
      fromMapResult.visitorEmail = (String)visitorEmail;
      Object visitorPhone = map.get("visitorPhone");
      fromMapResult.visitorPhone = (String)phoneNumber;
      return fromMapResult;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class VisitorTagsRequest {
    private ArrayList tags;
    public ArrayList getTags() { return tags; }
    public void setTags(ArrayList setterArg) { this.tags = setterArg; }

    HashMap toMap() {
      HashMap<String, Object> toMapResult = new HashMap<>();
      toMapResult.put("tags", tags);
      return toMapResult;
    }
    static VisitorTagsRequest fromMap(HashMap map) {
      VisitorTagsRequest fromMapResult = new VisitorTagsRequest();
      Object tags = map.get("tags");
      fromMapResult.tags = (ArrayList)tags;
      return fromMapResult;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class VisitorNoteRequest {
    private String note;
    public String getNote() { return note; }
    public void setNote(String setterArg) { this.note = setterArg; }

    HashMap toMap() {
      HashMap<String, Object> toMapResult = new HashMap<>();
      toMapResult.put("note", note);
      return toMapResult;
    }
    static VisitorNoteRequest fromMap(HashMap map) {
      VisitorNoteRequest fromMapResult = new VisitorNoteRequest();
      Object note = map.get("note");
      fromMapResult.note = (String)note;
      return fromMapResult;
    }
  }

  /** Generated interface from Pigeon that represents a handler of messages from Flutter.*/
  public interface ChatApi {
    void initialize(InitializeRequest arg);
    void setDepartment(SetDepartmentRequest arg);
    void startChat(StartChatRequest arg);

    /** Sets up an instance of `ChatApi` to handle messages through the `binaryMessenger` */
    static void setup(BinaryMessenger binaryMessenger, ChatApi api) {
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.ChatApi.initialize", new StandardMessageCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            HashMap<String, HashMap> wrapped = new HashMap<>();
            try {
              @SuppressWarnings("ConstantConditions")
              InitializeRequest input = InitializeRequest.fromMap((HashMap)message);
              api.initialize(input);
              wrapped.put("result", null);
            }
            catch (Exception exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.ChatApi.setDepartment", new StandardMessageCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            HashMap<String, HashMap> wrapped = new HashMap<>();
            try {
              @SuppressWarnings("ConstantConditions")
              SetDepartmentRequest input = SetDepartmentRequest.fromMap((HashMap)message);
              api.setDepartment(input);
              wrapped.put("result", null);
            }
            catch (Exception exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.ChatApi.startChat", new StandardMessageCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            HashMap<String, HashMap> wrapped = new HashMap<>();
            try {
              @SuppressWarnings("ConstantConditions")
              StartChatRequest input = StartChatRequest.fromMap((HashMap)message);
              api.startChat(input);
              wrapped.put("result", null);
            }
            catch (Exception exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
    }
  }

  /** Generated interface from Pigeon that represents a handler of messages from Flutter.*/
  public interface ProfileApi {
    void setVisitorInfo(SetVisitorInfoRequest arg);
    void addVisitorTags(VisitorTagsRequest arg);
    void removeVisitorTags(VisitorTagsRequest arg);
    void setVisitorNote(VisitorNoteRequest arg);
    void appendVisitorNote(VisitorNoteRequest arg);
    void clearVisitorNotes();

    /** Sets up an instance of `ProfileApi` to handle messages through the `binaryMessenger` */
    static void setup(BinaryMessenger binaryMessenger, ProfileApi api) {
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.ProfileApi.setVisitorInfo", new StandardMessageCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            HashMap<String, HashMap> wrapped = new HashMap<>();
            try {
              @SuppressWarnings("ConstantConditions")
              SetVisitorInfoRequest input = SetVisitorInfoRequest.fromMap((HashMap)message);
              api.setVisitorInfo(input);
              wrapped.put("result", null);
            }
            catch (Exception exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.ProfileApi.addVisitorTags", new StandardMessageCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            HashMap<String, HashMap> wrapped = new HashMap<>();
            try {
              @SuppressWarnings("ConstantConditions")
              VisitorTagsRequest input = VisitorTagsRequest.fromMap((HashMap)message);
              api.addVisitorTags(input);
              wrapped.put("result", null);
            }
            catch (Exception exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.ProfileApi.removeVisitorTags", new StandardMessageCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            HashMap<String, HashMap> wrapped = new HashMap<>();
            try {
              @SuppressWarnings("ConstantConditions")
              VisitorTagsRequest input = VisitorTagsRequest.fromMap((HashMap)message);
              api.removeVisitorTags(input);
              wrapped.put("result", null);
            }
            catch (Exception exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.ProfileApi.setVisitorNote", new StandardMessageCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            HashMap<String, HashMap> wrapped = new HashMap<>();
            try {
              @SuppressWarnings("ConstantConditions")
              VisitorNoteRequest input = VisitorNoteRequest.fromMap((HashMap)message);
              api.setVisitorNote(input);
              wrapped.put("result", null);
            }
            catch (Exception exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.ProfileApi.appendVisitorNote", new StandardMessageCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            HashMap<String, HashMap> wrapped = new HashMap<>();
            try {
              @SuppressWarnings("ConstantConditions")
              VisitorNoteRequest input = VisitorNoteRequest.fromMap((HashMap)message);
              api.appendVisitorNote(input);
              wrapped.put("result", null);
            }
            catch (Exception exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.ProfileApi.clearVisitorNotes", new StandardMessageCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            HashMap<String, HashMap> wrapped = new HashMap<>();
            try {
              api.clearVisitorNotes();
              wrapped.put("result", null);
            }
            catch (Exception exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
    }
  }
  private static HashMap wrapError(Exception exception) {
    HashMap<String, Object> errorMap = new HashMap<>();
    errorMap.put("message", exception.toString());
    errorMap.put("code", null);
    errorMap.put("details", null);
    return errorMap;
  }
}