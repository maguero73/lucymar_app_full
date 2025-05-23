FROM jenkins/jenkins:lts

USER root

# Instalar utilidades necesarias y dependencias para Docker
RUN apt-get update && apt-get install -y \
    curl \
    gnupg \
    sudo \
    unzip \
    git \
    ca-certificates \
    lsb-release \
    apt-transport-https \
    software-properties-common \
    && rm -rf /var/lib/apt/lists/*

# Agregar repositorio de Docker e instalar Docker CLI
RUN curl -fsSL https://download.docker.com/linux/debian/gpg | gpg --dearmor -o /usr/share/keyrings/docker-archive-keyring.gpg && \
    echo "deb [arch=amd64 signed-by=/usr/share/keyrings/docker-archive-keyring.gpg] https://download.docker.com/linux/debian \
    $(lsb_release -cs) stable" > /etc/apt/sources.list.d/docker.list && \
    apt-get update && \
    apt-get install -y docker-ce-cli && \
    rm -rf /var/lib/apt/lists/*

# Instalar Node.js 21.6.2 y npm 10.4.0
RUN curl -fsSL https://deb.nodesource.com/setup_21.x | bash - && \
    apt-get install -y nodejs && \
    npm install -g npm@10.4.0

# Verificación de Node y npm
RUN node -v && npm -v

# Instalar Maven 3.6.3
ENV MAVEN_VERSION 3.6.3
ENV MAVEN_HOME /opt/maven

RUN curl -fsSL https://archive.apache.org/dist/maven/maven-3/${MAVEN_VERSION}/binaries/apache-maven-${MAVEN_VERSION}-bin.tar.gz \
    | tar -xz -C /opt && \
    ln -s /opt/apache-maven-${MAVEN_VERSION} /opt/maven

ENV PATH=$PATH:/opt/maven/bin

# Verificación de Maven
RUN mvn -version

# Volver al usuario jenkins
USER jenkins

