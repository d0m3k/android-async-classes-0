# Async time!
Pobierz ten projekt oraz [android-async-classes-1](https://github.com/d0m3k/android-async-classes-1), a następnie...

## Broadcasts
1. __Manifest-declared:__ W `android-async-classes-0` (`SimpleBroadcaster`) stwórz klasę dziedziczącą po `BroadcastReceive`r, która wyświetli `Toast` wypisujący tekst na ekran w metodzie `onReceive`. Następnie, dodaj do manifestu tę klasę jako receiver reagujący na zmianę czasu w systemie (`android.intent.action.TIME_SET`)
2. __Context-registered:__ W `android-async-classes-0` (`SimpleBroadcaster`) stwórz klasę dziedziczącą po `BroadcastReceiver`, która wyświetli jeszcze inny `Toast` wypisujący na ekran w metodzie `onReceive`; zarejestruj ten broadcaster w głównej activity aplikacji dla zmiany trybu lotniczego (`android.intent.action.AIRPLANE_MODE`). Nie zapomnij o odrejestrowaniu w `onDestroy()`!
3. __Context-registered, multi-app:__ W `android-async-classes-1` (`Broadcast2`) dodaj akcję dla przycisku `button`, która spowoduje wysłanie jakiegoś stringa przy użyciu sendBroadcast. Pamiętaj, że nazwa akcji powinna odpowiadać nazwie projektu `+.broadcast.[NAZWA_AKCJI]` (jak `pl.dom3k.broadcaster2.broadcast.MY_NOTIFICATION`)
W `android-async-classes-0` (`SimpleBroadcaster`) odbierz tę akcję w taki sam sposób, jak dla zadania drugiego, ale pamiętaj o odebraniu i wyświetleniu zawartości podanego stringa. Nie zapomnij o odrejestrowaniu w `onDestroy()`!
