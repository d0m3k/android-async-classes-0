# Async time!
Pobierz ten projekt oraz [android-async-classes-1](https://github.com/d0m3k/android-async-classes-1), a następnie...

## Broadcasts
Przed rozpoczęciem wykonywania zadań z tej sekcji, mozesz przepiąć się na branch `broadcast-0`.

1. __Manifest-declared:__ W `android-async-classes-0` (`SimpleBroadcaster`) stwórz klasę dziedziczącą po `BroadcastReceiver`, która wyświetli `Toast` wypisujący tekst na ekran w metodzie `onReceive`. Następnie, dodaj do manifestu tę klasę jako receiver reagujący na zmianę czasu w systemie (`android.intent.action.TIME_SET`)
2. __Context-registered:__ W `android-async-classes-0` (`SimpleBroadcaster`) stwórz klasę dziedziczącą po `BroadcastReceiver`, która wyświetli jeszcze inny `Toast` wypisujący na ekran w metodzie `onReceive`; zarejestruj ten broadcaster w głównej activity aplikacji dla zmiany trybu lotniczego (`android.intent.action.AIRPLANE_MODE`). Nie zapomnij o odrejestrowaniu w `onDestroy()`!
3. __Context-registered, multi-app:__ W `android-async-classes-1` (`Broadcast2`) dodaj akcję dla przycisku `button`, która spowoduje wysłanie jakiegoś stringa przy użyciu sendBroadcast. Pamiętaj, że nazwa akcji powinna odpowiadać nazwie projektu `+.broadcast.[NAZWA_AKCJI]` (jak `pl.dom3k.broadcaster2.broadcast.MY_NOTIFICATION`)
W `android-async-classes-0` (`SimpleBroadcaster`) odbierz tę akcję w taki sam sposób, jak dla zadania drugiego, ale pamiętaj o odebraniu i wyświetleniu zawartości podanego stringa. Nie zapomnij o odrejestrowaniu w `onDestroy()`!

## Content Providers
1. __Data insert:__ W `android-async-classes-1` uzupełnij kod w klasie `MainActivity` tak, aby można było po naciśnięciu przycisku dodać do bazy danych zawartość pola tekstowego. Wszystkie wymagane stałe zawarte są w klasach `MySQLiteHelper` i `MyContentProvider`.

2. __Data query and Cursor:__ W `android-async-classes-0` uzupełnij kod w klasie `MainActivity` tak, aby można było za pomocą przycisków iterować po rekordach w bazie (dodawanych w poprzednim poleceniu). Logika działania przycisków i pola tekstowego dowolna, aczkolwiek nazwy przycisków mogą sporo sugerować.

## AsyncTask
1. __Async Download and Render:__ W `android-async-classes-0` dodaj kod, który umożliwi wyświetlanie na ImageButton zdjęć przy pomocy API "http://thecatapi.com/api/images/get?format=src&type=png". Wciśnięcie przycisku powinno rozpocząć nowy AsyncTask, który ściąga obrazek, a następnie ustawia go jako tło buttona.
