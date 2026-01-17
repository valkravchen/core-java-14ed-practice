## Установка JDK 25 в WSL (Debian 12)

### Скачивание и установка
```bash
# Скачивание
wget https://api.adoptium.net/v3/binary/latest/25/ga/linux/x64/jdk/hotspot/normal/eclipse -O jdk-25.tar.gz

# Установка в /opt
sudo tar -xzf jdk-25.tar.gz -C /opt/

# Настройка переменных окружения
echo 'export JAVA_HOME=/opt/jdk-25.0.1+8' >> ~/.bashrc
echo 'export PATH=$JAVA_HOME/bin:$PATH' >> ~/.bashrc
source ~/.bashrc
```

### Проверка
- javac 25.0.1 ✅
- java 25.0.1 LTS ✅
- jshell работает ✅

## Примеры из книги
- Репозиторий: https://horstmann.com/corejava
- Welcome.java запущен успешно ✅
- ImageViewer.java работает в WSLg ✅

## JShell
- REPL для экспериментов с Java
- Автодополнение по Tab
- История команд (↑/↓)
