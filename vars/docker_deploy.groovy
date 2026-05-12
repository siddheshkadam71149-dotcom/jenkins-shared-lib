def call(Map config = [:]) {

    sh """
    docker rm -f notes-app || true

    docker run -d \
    --name notes-app \
    -p 8000:8000 \
    -e DB_NAME=${config.DB_NAME} \
    -e DB_USER=${config.DB_USER} \
    -e DB_PASSWORD=${config.DB_PASSWORD} \
    -e DB_HOST=${config.DB_HOST} \
    -e DB_PORT=${config.DB_PORT} \
    --link mysql-container:mysql-container \
    ${config.IMAGE_NAME}
    """
}
