# Rotorgram

## How to make bot?

extend a ```TelegramBot``` Class.

``` Java
public class YourBot extends TelegramBot {

}
```
onStart method calling on start time.

load your file or register some listeners.

``` Java
public class YourBot extends TelegramBot {
  @Override
  public void onStart() {
    registerListener(TextMessageEvent.class, e -> {
      // do something...
    });
  }
}
```

create your cool features!

and insert this in main method.

```Java
Static.startBot(YourBot.class, "Your Bot Token");
```

and run your main method.

## Listener

you can registering listeners.

### Event List

* InlineQueryEvent
* MessageEvent
  * SimpleMessageEvent
  * TextMessageEvent

# Run Functions

Rotorgram supports some functions.

If you can't found function?

```Requester``` class can call function!

Requester.request("Function name", Map<String, String> map)

using ```EntryBuilder``` class to creating map better easy.
