# Async time!
Pobierz ten projekt oraz []()

1. Manifest-declared: W android-async-classes-0 (SimpleBroadcaster) stwórz klasę dziedziczącą po BroadcastReceiver, która wyświetli Toast wypisujący tekst na ekran w metodzie onReceive. Następnie, dodaj do manifestu tę klasę jako receiver reagujący na zmianę czasu w systemie (android.intent.action.TIME_SET)
2. Context-registered: W android-async-classes-0 (SimpleBroadcaster) stwórz klasę dziedziczącą po BroadcastReceiver, która wyświetli jeszcze inny Toast wypisujący na ekran w metodzie onReceive; zarejestruj ten Broadcaster w głównej activity aplikacji dla zmiany trybu lotniczego (android.intent.action.AIRPLANE_MODE). Nie zapomnij o odrejestrowaniu w onDestroy()!
3. Context-registered, multi-app: W android-async-classes-1 (Broadcast2) dodaj akcję dla przycisku button, która spowoduje wysłanie jakiegoś stringa przy użyciu sendBroadcast. Pamiętaj, że nazwa akcji powinna odpowiadać nazwie projektu +.broadcast.[NAZWA_AKCJI] (jak pl.dom3k.broadcaster2.broadcast.MY_NOTIFICATION)
W android-async-classes-0 (SimpleBroadcaster) odbierz tę akcję w taki sam sposób, jak dla zadania drugiego, ale pamiętaj o odebraniu i wyświetleniu zawartości podanego stringa. Nie zapomnij o odrejestrowaniu w onDestroy()!
